package com.example.cafeapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Configure static resources for /api/products
        registry.addResourceHandler("/api/products/**")
                .addResourceLocations("classpath:/static/api/products/");

        // Configure static resources for /api/orders
        registry.addResourceHandler("/api/orders/**")
                .addResourceLocations("classpath:/static/api/orders/");

        // Add this line to serve static resources from the root ("/")
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");
    }
}
