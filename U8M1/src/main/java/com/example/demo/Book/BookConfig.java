package com.example.demo.Book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            Book thg = new Book(
                    "The Hunger Games",
                    "Suzanne Collins"
            );

            Book cf = new Book(
                    "Catching Fire",
                    "Suzanne Collins"
            );

            Book mj = new Book(
                    "Mockingjay",
                    "Suzanne Collins"
            );

            Book tmr = new Book(
                    "The Maze Runner",
                    "James Dashner"
            );

            repository.saveAll(List.of(thg, cf, mj, tmr));
        };
    }
}
