package in.co.rays.autowireByAnniotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.co.rays.AppConfig;

public class TestUserService {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = context.getBean(UserService.class);
		
		userService.testAdd();

	}
}