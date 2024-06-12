package com.pandaman.sharefavplaceapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// public class WebMvcConfig implements WebMvcConfigurer {
//     @Override
//     public void addCorsMappings(CorsRegistry registry) {
//         final String origin = System.getenv("FRONT_URL");
//         registry.addMapping("/**")
//                 //.allowedOrigins("http://localhost:3000") // 許可するオリジンを指定する
//                 .allowedOrigins("*") // 許可するオリジンを指定する
//                 .allowedMethods("*") // 許可するHTTPメソッドを指定する
//                 .allowedHeaders("*") // 許可するヘッダーを指定する
//                 .allowCredentials(true); // クライアントからの認証情報の送信を許可する
//     }
// }

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}