package com.bqjr.configuration;

import com.bqjr.filter.ApiInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by hp on 2016/12/21.
 */
@Configuration
@ComponentScan(basePackages = "com.bqjr")
public class AppConfiguration extends WebMvcConfigurerAdapter{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ApiInterceptor());
    }
    @Bean
    public MappingJackson2HttpMessageConverter json() {
        return new MappingJackson2HttpMessageConverter();
    }

}
