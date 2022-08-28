package com.crud.tasks.config;

        import io.swagger.v3.oas.annotations.OpenAPIDefinition;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.web.client.RestTemplate;
        import springfox.documentation.builders.PathSelectors;
        import springfox.documentation.builders.RequestHandlerSelectors;
        import springfox.documentation.spi.DocumentationType;
        import springfox.documentation.spring.web.plugins.Docket;

//@EnableSwagger2
@OpenAPIDefinition
@Configuration //utworzenie miejsca dla tworzenia "ręcznych" beanów
public class CoreConfiguration {

    @Bean
    public RestTemplate restTemplate() { //umożliwia realizowanie żądań HTTP pomiędzy serwerami
        return new RestTemplate();
    }

    @Bean
    public Docket api() { //klasa Docet odpowiada za udostępnienie metod pozwalających na konfigurację Swaggera
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.crud.tasks.controller"))
//                metoda apis() umożliwia wybranie pakietów, które mają być przeszukane w celu znalezienia controllerów
                .paths(PathSelectors.any())
//                Metoda paths() pozwala na bardziej dogłębne skanowanie i może np. umożliiwić wybór konkretnych mappingów controllera.
                .build();
    }
}