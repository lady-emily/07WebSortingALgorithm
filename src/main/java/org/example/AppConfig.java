package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

//    // Define a bean for the SortingAlgorithms
//    @Bean
//    public SortingAlgorithms sortingAlgorithms() {
//        return new SortingAlgorithms();
//    }

    // Define a bean for the StudentService
//    @Bean
//    public Student getStudent() {
//        return new Student();
//    }
}
