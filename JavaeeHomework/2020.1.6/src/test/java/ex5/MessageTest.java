package ex5;

import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageTest {
    @Test
    public void printMes(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("src/main/resources/SpringContext.xml");
        Message message=(Message) applicationContext.getBean("Helloworld");
        System.out.println(message.getContent());
    }
}
