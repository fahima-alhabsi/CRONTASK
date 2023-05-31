package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled(cron = "0 */5 * * * *")
    public void schedualing(){
        System.out.println("Hello fahima");
    }
}
