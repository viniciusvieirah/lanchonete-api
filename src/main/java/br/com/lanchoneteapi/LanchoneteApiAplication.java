package br.com.lanchoneteapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAutoConfiguration
@SpringBootApplication
public class LanchoneteApiAplication {
    public  static void main(String args[]){

        SpringApplication.run(LanchoneteApiAplication.class ,args);
    }

}


