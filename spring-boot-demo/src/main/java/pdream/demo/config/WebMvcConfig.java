package pdream.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pdream.demo.converter.StringToNullConverter;

/**
 * @author dongjianzhu
 * @date 2020/2/17 12:26
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToNullConverter());
    }
}
