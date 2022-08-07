package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    CommandLineRunner commandLineRunner (IStudentRepository iStudentRepository){
        return args -> {
            iStudentRepository.save(new Student("Mariia", "Jones", "d@ae", 1));
        };
    }

}
