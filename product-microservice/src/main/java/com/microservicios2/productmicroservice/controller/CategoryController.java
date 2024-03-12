package com.microservicios2.productmicroservice.controller;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categories")
@Getter
@Setter
public class CategoryController {

    @Value("${testProp}")
    private String testProp;
    private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @GetMapping("test-prop")
    public String getTestProp() {
        try {
            // Intenta hacer algo con la propiedad
            System.out.println("Value of testProp: " + testProp);
            return this.testProp;
        } catch (Exception e) {
            // Captura la excepción y muestra el mensaje de error
            System.err.println("Error: " + e.getMessage());
            throw e;
        }
    }
}