package in.co.rays.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWireByConstructor {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-byconstructor.xml");

		UserService userService = (UserService) context.getBean("userService");
		
		userService.testAdd();
	}

}