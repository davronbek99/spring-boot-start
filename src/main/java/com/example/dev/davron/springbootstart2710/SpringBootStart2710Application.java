package com.example.dev.davron.springbootstart2710;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SpringBootStart2710Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStart2710Application.class, args);
    }

    //    @Scheduled(fixedRate = 1000L)
//    public void startRate() {
//        System.out.println("New rate " + new Date());
//    }
//
    @Scheduled(initialDelay = 4000L, fixedDelay = 2000L)
    public void startDelay() {
        System.out.println("New delay " + new Date());
    }

    @Scheduled(cron = "0 29 15 * * *")
    public void startCron() {
        System.out.println("New cron " + new Date());
    }


}
