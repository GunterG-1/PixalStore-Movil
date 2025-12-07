package com.example.Pixel.Gamers.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("PixelStore - API de Usuarios")
                        .version("1.0.0")
                        .description("API REST para la gestión de usuarios de PixelStore")
                        .contact(new Contact()
                                .name("PixelStore Team")
                                .email("info@pixelstore.com")));
    }
}
