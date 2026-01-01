package com.company.employeemanagement.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    public OpenAPI employeeManagementOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Employee Management API")
                        .description("REST APIs for managing employees int the organization")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Raj Merai")
                                .email("rajmerai3322@gmail.com")
                                .url("https://github.com/RajMerai")
                        )
                );
    }
}
