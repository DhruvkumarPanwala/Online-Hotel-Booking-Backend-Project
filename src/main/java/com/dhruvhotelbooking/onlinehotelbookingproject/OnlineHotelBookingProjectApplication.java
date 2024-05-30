package com.dhruvhotelbooking.onlinehotelbookingproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class OnlineHotelBookingProjectApplication implements WebMvcConfigurer {

        public static void main(String[] args) {
            SpringApplication.run(OnlineHotelBookingProjectApplication.class, args);
        }

   /* @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("Content-Type")
                .allowCredentials(true);
    }*/
   /*@Bean
   CorsConfigurationSource corsConfigurationSource() {
       CorsConfiguration configuration = new CorsConfiguration();
       configuration.setAllowedOrigins(Arrays.asList("http://localhost:5173"));
       configuration.setAllowedMethods(Arrays.asList("GET","POST"));
       UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
       source.registerCorsConfiguration("/**", configuration);
       return source;
   }*/
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Allow all origins for all endpoints
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }

}

