package com.codecool.emualapitvany;

import com.codecool.emualapitvany.model.Patient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmualapitvanyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmualapitvanyApplication.class, args);
    }

    @Bean
    public CommandLineRunner init() {
        return args -> {
             Patient user = Patient.builder()
                    .username("userName")
                    .firstName("firstName")
                    .lastName("lastName")
                    .email("email")
                    .password("password")
                    .parentFirstName("parentFirstName")
                    .parentSecondName("parentSecondName")
                    .build();

            System.out.println(user);
        };
    }
}


