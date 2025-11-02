package in.co.rays.notype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireNoType {
	
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-notype.xml");

		UserService userService = (UserService) context.getBean("userService");
		
		userService.testAdd();
	}

}