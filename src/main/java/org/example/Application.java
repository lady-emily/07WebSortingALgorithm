package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.example.AppConfig;

public class Application {

    public static void main(String[] args) {
        // Create an application context based on the configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Now you can retrieve beans from the context as needed, for example:
        // StudentService studentService = context.getBean(StudentService.class);
        System.out.println("Spring Application Context has been initialized.");
    }
}
