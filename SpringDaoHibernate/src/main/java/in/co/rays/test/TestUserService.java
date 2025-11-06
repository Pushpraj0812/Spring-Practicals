package in.co.rays.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import in.co.rays.dto.UserDTO;
import in.co.rays.service.UserServiceInt;

import org.springframework.stereotype.Component;

@Component("testUserService")
public class TestUserService {

	@Autowired
	private UserServiceInt userService = null;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TestUserService test = (TestUserService) context.getBean("testUserService");

		test.testAdd();
	}

	private void testAdd() {

		UserDTO dto = new UserDTO();

		// dto.setId(0);
		dto.setFirstName("Pushpraj");
		dto.setLastName("Singh");
		dto.setLogin("pushpraj0812@gmail.com");
		dto.setPassword("0812");

		long pk = userService.add(dto);
		System.out.println("data added successfully: " + pk);
	}

}