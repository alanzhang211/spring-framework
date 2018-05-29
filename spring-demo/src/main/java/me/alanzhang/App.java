package me.alanzhang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello Spring!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:bean.xml");
		String XMLPath = "/spring-demo/src/resources/bean.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(XMLPath);
		HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
		System.out.println(helloSpring.sayHello("alan"));
    }
}
