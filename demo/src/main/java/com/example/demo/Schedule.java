package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
   // ( problem 1)
//    @Scheduled(cron = "0 */5 * * * *")
//    public void schedualing(){
//        System.out.println("Hello fahima");
//    }

//    (problem 2)
//    @Scheduled(cron = "0 0 * * * *")
//public void schedualing(){
//    System.out.println("Hello fahima");
//}

 //(problem 3)
    @Scheduled(cron = "0 30 14 * * *")
    public void schedualing(){
        System.out.println("Hello fahima");
    }
}
