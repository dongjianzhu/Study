package pdream.demo.config;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.cache.MemoryConstrainedCacheManager;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.mgt.SessionsSecurityManager;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pdream.demo.shiro.LoginRealm;

/**
 * shiro 相关
 *
 * @author dongjianzhu
 * @date 2020年1月13日
 */
@Configuration
public class ShiroConfig {

    /**
     * 配置url过滤器
     */
    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
        // logged in users with the 'admin' role
        chainDefinition.addPathDefinition("/admin/**", "authc, roles[admin]");
        // logged in users with the 'document:read' permission
        chainDefinition.addPathDefinition("/docs/**", "authc, perms[document:read]");
        // all other paths require a logged in user
        chainDefinition.addPathDefinition("/**", "authc");
        return chainDefinition;
    }

    /**
     * 设置用于匹配密码的CredentialsMatcher
     */
    @Bean
    public HashedCredentialsMatcher credentialsMatcher() {
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        // 散列算法，这里使用更安全的sha256算法
        credentialsMatcher.setHashAlgorithmName(Sha256Hash.ALGORITHM_NAME);
        // 数据库存储的密码字段使用HEX还是BASE64方式加密
        credentialsMatcher.setStoredCredentialsHexEncoded(false);
        // 散列迭代次数
        credentialsMatcher.setHashIterations(1024);
        return credentialsMatcher;
    }

    @Bean
    public LoginRealm loginRealm(HashedCredentialsMatcher matcher) {
        LoginRealm loginRealm = new LoginRealm();
        loginRealm.setCredentialsMatcher(matcher);
        return new LoginRealm();
    }

    /**
     * 配置security并设置userReaml，避免xxxx required a bean named 'authorizer' that could not be found.的报错
     */
    @Bean
    public SessionsSecurityManager securityManager(LoginRealm loginRealm, CacheManager cacheManager) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(loginRealm);
        securityManager.setCacheManager(cacheManager);
        return securityManager;
    }

    @Bean
    protected CacheManager cacheManager() {
        return new MemoryConstrainedCacheManager();
    }
}
