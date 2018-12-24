package com.sw.zs.Bean;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedualTask {
    @Scheduled(initialDelay = 3000,fixedRate = 5000)
    public void ShowTime(){
        String[] s= new String[]{"zs","zd"};
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date())+":"+Thread.currentThread().getName());
    }
}
