package com.pandaman.sharefavplaceapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        final String origin = System.getenv("FRONT_URL");
        registry.addMapping("/**")
               .allowedOrigins(origin)
               .allowedMethods(CorsConfiguration.ALL);
    }
}
