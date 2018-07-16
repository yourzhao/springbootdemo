package ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent event){
        String msg = event.getMsg();
        System.out.println("bean-demoListener接收到了bean-demopublisher发布消息：" + msg);
    }
}
