package ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JST250WayService {
    @PostConstruct//在构造函数执行之后执行
    public void init(){
        System.out.println("jst250 init method");
    }
    public JST250WayService(){
        super();
        System.out.println("JSr250构造函数");
    }
    @PreDestroy//在Bean销毁之后执行
    public void destory(){
        System.out.println("jsr250 destory method");
    }
}
