package com.boraji.tutorial.spring;

import java.sql.SQLException;
import java.util.List;

import com.boraji.tutorial.spring.service.CompaniesService;
import com.boraji.tutorial.spring.serviceEntities.Companies;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.boraji.tutorial.spring.config.AppConfig;
import com.boraji.tutorial.spring.entity.User;
import com.boraji.tutorial.spring.service.UserService;

/**
 * @author imssbora
 *
 */
public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      CompaniesService companiesService = context.getBean(CompaniesService.class);

      companiesService.create(new Companies("company1"));


      List<Companies> companies1 = companiesService.read();
      companies1.stream().forEach(System.out::println);
      context.close();
   }
}
