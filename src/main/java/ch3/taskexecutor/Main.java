package ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//失败了
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AsyncTaskService.class);

        AsyncTaskService asyncTaskService = annotationConfigApplicationContext.getBean(AsyncTaskService.class);
        for(int i = 0; i < 10; i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        annotationConfigApplicationContext.close();
    }
}
