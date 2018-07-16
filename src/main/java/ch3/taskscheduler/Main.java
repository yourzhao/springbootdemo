package ch3.taskscheduler;

import javafx.concurrent.Task;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
       // context.getBean(ScheduledTaskService.class);

    }
}
