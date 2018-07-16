package ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 任务类
 *
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat =
            new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)  //声明这是一个计划任务 时间间隔是5000ms
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次： " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 58 23 ? * *") //cron 指定在一定时间执行 23：58
    public void fixTimeExecution(){
        System.out.println("在指定的时间" + dateFormat.format(new Date()) + "执行");
    }
}
