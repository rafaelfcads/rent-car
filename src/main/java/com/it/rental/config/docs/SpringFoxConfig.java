package com.it.rental.config.docs;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
	
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.tags(new Tag("User Entity", "Repository for Address entities"))
                .apiInfo(getApiInfo());
    }
    
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "Spring Data REST - POSTGRESQL - API",
                "Aplicando o guia de ref. Spring Data REST - POSTGRESQL",
                "v1.0.0",
                null,
                null,
                null,
                null,
                Collections.emptyList()
        );
    }
}
