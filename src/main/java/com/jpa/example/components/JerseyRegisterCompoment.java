package com.jpa.example.components;

import com.jpa.example.controller.StudentController;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class JerseyRegisterCompoment extends ResourceConfig {
    @Value("${spring.jersey.application-path:/}")
    private String apiPath;

    public JerseyRegisterCompoment() {
        register(StudentController.class);
    }

    @PostConstruct
    public void init() {
        // Register components where DI is needed
        this.configureSwagger();
    }

    private void configureSwagger() {
        System.out.println("init bean config in Jersey config:" + apiPath);
        // Available at localhost:port/swagger.json
        this.register(ApiListingResource.class);
        this.register(SwaggerSerializers.class);

        BeanConfig config = new BeanConfig();
        config.setConfigId("springboot-jersey-swagger-docker-example");
        config.setTitle("Spring Boot + Jersey + Swagger  Example");
        config.setVersion("v1");
//		config.setHost("localhost:8080");
        config.setContact("Leo Jiang");
        config.setSchemes(new String[] { "http", "https"});
        config.setBasePath(apiPath);
        config.setResourcePackage("com.jpa.example");
        config.setPrettyPrint(true);
        config.setScan(true);
    }
}
