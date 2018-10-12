package com.stackroute;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;@ComponentScan(basePackages = "com.stackroute")/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(Application.class);
        Application application=context.getBean(Application.class);
        application.start();
    }
    @Autowired
    private Message message;
    private void start(){
        System.out.println("Message " + message.getMessage());
    }
}