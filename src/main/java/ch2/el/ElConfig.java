package ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("ch2.el")
@PropertySource("classpath:ch2/el/test.properties")
public class ElConfig {
    @Value("I LOVE YOU")
    private String normal;//注入字符串

    @Value("#{systemProperties['os.name']}")
    private String osName;//注入操作系统

    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomNumber;//注入表达式

    @Value("#{demoService.another}")
    private String fromAnother;//注入其他类的属性

    @Value("classpath:ch2/el/demo.txt")
    private Resource testFile;//注入文件资源

    @Value("http://www.baidu.com")
    private Resource testUrl;//注入连接资源

    @Value("${book.name}")
    private String bookName;//注入配置文件

    @Autowired
    private Environment environment;//注入的properties可以从Environment中获取

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);

           System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
