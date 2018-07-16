package ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 任务类
 */
@Service
public class AsyncTaskService {

    @Async   //表明该方法是个异步方法，如果注解类，表明类中所有的方法都是异步方法
    public void executeAsyncTask(Integer i){
        System.out.println("异步执行任务： " + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("异步执行任务+1s： " + (i + 1));
    }
}
