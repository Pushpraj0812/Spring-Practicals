package in.co.rays.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireByName {
	
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-byname.xml");

		UserService userService = (UserService) context.getBean("userService");
		
		userService.testAdd();
	}

}