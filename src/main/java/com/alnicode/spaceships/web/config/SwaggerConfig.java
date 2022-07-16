package com.alnicode.spaceships.web.config;

import com.alnicode.spaceships.util.constants.SwaggerConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Swagger configuration.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * Define a bean with the swagger configuration.
     *
     * @return a {@link Docket}.
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(SwaggerConstants.PACKAGE))
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * Set the main info.
     *
     * @return an {@link ApiInfo}.
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .contact(new Contact(SwaggerConstants.NAME, SwaggerConstants.URL, SwaggerConstants.EMAIL))
                .title(SwaggerConstants.TITLE)
                .description(SwaggerConstants.DESCRIPTION)
                .build();
    }

}
