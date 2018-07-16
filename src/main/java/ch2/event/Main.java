package ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPubilsher demoPubilsher = context.getBean(DemoPubilsher.class);
        demoPubilsher.publish("Hello application event");
        context.close();
    }

}
