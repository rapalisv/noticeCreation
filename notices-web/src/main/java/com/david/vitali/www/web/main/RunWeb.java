package com.david.vitali.www.web.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Main Class.
 * 
 * @author rapalisv Date: 22.07.2017
 *
 */
@SpringBootApplication
@EntityScan(basePackages="com.david.vitali.www.persistance.entity")
@ComponentScan(basePackages="com.david.vitali.www.*")
@EnableJpaRepositories(basePackages="com.david.vitali.www.persistance.repository")
public class RunWeb {
  public static void main(String[] args) {
    SpringApplication.run(RunWeb.class, args);
  }
  
}
