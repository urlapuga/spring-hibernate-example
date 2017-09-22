package com.boraji.tutorial.spring;

import com.boraji.tutorial.spring.config.AppConfig;
import com.boraji.tutorial.spring.service.CompaniesService;
import com.boraji.tutorial.spring.service.PingerService;
import com.boraji.tutorial.spring.serviceEntities.Pinger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

       PingerService pingerService = context.getBean(PingerService.class);

      pingerService.add(new Pinger("192.168.0.1","test device"));
       // pingerService.pingList().stream().forEach(System.out::println);
    }
}
