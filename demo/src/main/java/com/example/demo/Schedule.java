package com.example.demo;

import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Date;

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
//    @Scheduled(cron = "0 30 14 * * *")
//    public void schedualing(){
//        System.out.println("Hello fahima");
//    }

    //(problem 4)
//    @Scheduled(cron = "0 0 8 * * 1")
//    public void schedualing(){
//        System.out.println("Hello fahima");
//    }

    //(problem 5)
//    @Scheduled(cron = "0 0 3 1 * *")
//    public void schedualing(){
//        System.out.println("Hello fahima");
//    }


    //(problem 6)

//    @Scheduled(cron = " 0 30 19,22 * * 0")
//    public void schedualing(){
//
//
//        System.out.println("Hello fahima");
//    }


    //(problem 7)
//    @Scheduled(cron = " 0 30 19,22 * * 0")
//    public void schedualing(){
//        System.out.println("Hello fahima");
//    }

//    //(problem 8)
//    @Scheduled(cron = "0 0 9-16 * * 1-5")
//    public void schedualing(){
//        System.out.println("Hello fahima");
//    }
    //(problem 9)
    @Scheduled(cron = " 0 3 * * * *")
    public void schedualing(){
        System.out.println("Hello fahima");
    }

}
