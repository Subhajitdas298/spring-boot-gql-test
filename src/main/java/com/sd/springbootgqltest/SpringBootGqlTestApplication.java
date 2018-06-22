package com.sd.springbootgqltest;

import com.sd.springbootgqltest.service.DataService;

import graphql.schema.GraphQLSchema;
import io.leangen.graphql.GraphQLSchemaGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootGqlTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGqlTestApplication.class, args);
    }
    
    @Bean
    GraphQLSchema schema(DataService dataService) {
        return new GraphQLSchemaGenerator()
                .withOperationsFromSingleton(dataService) //register the service
                .generate(); //done ;)
    }
}
