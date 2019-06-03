package com.shabris.jokeApp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class jokeConfig {
        @Bean
        public ChuckNorrisQuotes chuckNorrisQuotes(){
            return new ChuckNorrisQuotes();
        }
}
