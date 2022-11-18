package net.ict.ict01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class Ict01Application {

    public static void main(String[] args) {
        SpringApplication.run(Ict01Application.class, args);
    }

}
