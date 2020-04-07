package ex6;

import ex5.Message;
import ex6.person.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ex6Test {
    @Test
    public void excute(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("src/main/resources/SpringContext.xml");
        Person person =(Person) applicationContext.getBean("Person");
        person.eatFruit();
    }
}
