package com.senai.infoa.dobi.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title="dobi-api",
        version="1.0",
        description = "Grupo: Pedro Francisco, João Pedro, Guilherme Rodrigues, Thomas Bayão"
    )
)

public class Swagger {
    
}