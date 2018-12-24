package com.sw.zs.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.ScheduledFuture;

@Configuration
public class TaskPool {
    @Bean
    public TaskScheduler getPool() {
        ThreadPoolTaskScheduler task = new ThreadPoolTaskScheduler();
        task.setPoolSize(10);
        return task;
    }
}
