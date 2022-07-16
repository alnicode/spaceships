package com.alnicode.spaceships.web.config;

import java.util.Scanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Here are defined some beans.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Configuration
public class Config {

    /**
     * Define a {@link Scanner} bean.
     *
     * @return the scanner.
     */
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

}
