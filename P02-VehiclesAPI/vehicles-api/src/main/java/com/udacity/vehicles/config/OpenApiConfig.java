package com.udacity.vehicles.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!prod")
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi allApis() {
        return GroupedOpenApi.builder()
                .group("")
                .pathsToMatch("/**")//All APIs
                .build();

    }
    @Bean
    public OpenAPI openApiInfo() {
        return new OpenAPI()
                .info(createInfo());
    }

    private Info createInfo(){
        return new Info()
                .title("Vehicles system")
                .description("This page lists all the rest apis for Vehicles system")
                .version("1.0")
                .contact(new Contact()
                                .name("Sarah Alshahrani")
                                .email("sarah13azx@gmail.com")
                                .url("https://github.com/sarahsal19"));
    }
}
