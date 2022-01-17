package com.rkz.config;

import com.rkz.service.DBService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("testdb")
public class TestConfig {
    

    @Autowired
    private DBService dbService;

    @Bean
    public void instanciaBD(){
        this.dbService.instanciaBD();
    }
}
