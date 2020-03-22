package pdream.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class DemoApplicationTests {


    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        System.out.println(redisTemplate.getConnectionFactory());
    }


}
