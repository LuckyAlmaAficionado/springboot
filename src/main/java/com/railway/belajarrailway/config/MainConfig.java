package com.railway.belajarrailway.config;

import com.railway.belajarrailway.model.Users;
import com.railway.belajarrailway.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository repository) {
        return args -> {
            Users lucky = new Users(
                    "Lucky",
                    20
            );

            repository.save(lucky);
        };
    }

}
