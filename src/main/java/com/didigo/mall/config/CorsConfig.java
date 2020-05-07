package com.didigo.mall.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 解决跨域问题的拦截器
 */

@Configuration
public class CorsConfig {

    //注册组件
    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        //对所有请求地址拦截
        configSource.registerCorsConfiguration("/**",configurationBuilder());
        CorsFilter corsFilter = new CorsFilter(configSource);

        return  corsFilter;
    }

    private CorsConfiguration configurationBuilder() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //通配所有请求，方法
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");

        return corsConfiguration;
    }
}
