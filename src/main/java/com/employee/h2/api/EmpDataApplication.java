package com.employee.h2.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class EmpDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDataApplication.class, args);
	}
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
                              .apis(RequestHandlerSelectors.basePackage("com.employee.h2.api.controller"))
                              //To scan for RestControllers from this package
                              .paths(PathSelectors.any()).build()
                              .useDefaultResponseMessages(false); 
                              // For disabling default response messages
	}


}
