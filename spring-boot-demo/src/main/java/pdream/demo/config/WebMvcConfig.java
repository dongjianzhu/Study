package pdream.demo.config;

import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import pdream.demo.converter.StringToNullConverter;

/**
 * @author dongjianzhu
 * @date 2020/2/17 12:26
 */
@Component
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToNullConverter());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/production/**").addResourceLocations("classpath:/static/");
    }

}
