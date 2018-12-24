package com.sw.zs.Bean;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SecondTask {
    @Scheduled(initialDelay = 1000,fixedRate = 2000)
    public void TaskTwo(){
        System.out.println("two:"+Thread.currentThread().getName());

    }
}
