package in.co.rays.test;

import java.util.List;

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

		// test.testAdd();
		// test.testupdate();
		// test.testdelete();
		// test.testFindByPk();
		// test.testFindByLogin();
		// test.testauthenticate();
		test.testSearch();

	}

	private void testAdd() {

		UserDTO dto = new UserDTO();

		dto.setFirstName("pqr");
		dto.setLastName("pqr");
		dto.setLogin("pqr@gmail.com");
		dto.setPassword("0812");

		long pk = userService.add(dto);
		System.out.println("data added successfully: " + pk);
	}

	private void testupdate() {

		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("ABC");
		dto.setLastName("XYZ");
		dto.setLogin("ABC@gmail.com");
		dto.setPassword("pass1234");
		userService.update(dto);
		System.out.println("Record updated");

	}

	private void testdelete() {

		UserDTO dto = new UserDTO();
		dto.setId(1);

		userService.delete(dto);

	}

	private void testFindByPk() {

		UserDTO dto = null;

		dto = userService.findByPk(5L);

		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("user not found");
		}

	}

	private void testFindByLogin() {

		UserDTO dto = null;

		dto = userService.findByLogin("pushpraj0812@gmail.com");

		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("user not found");
		}
	}

	private void testauthenticate() {

		UserDTO dto = userService.authenticate("pushpraj0812@gmail.com", "0812");
		if (dto != null) {
			System.out.print(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLogin());
			System.out.println(dto.getPassword());
		} else {
			System.out.println("User not exist");
		}

	}
	
	private void testSearch() {

		List<UserDTO> list = null;
		UserDTO dto = null;

		list = userService.search(dto, 2, 5);

		for (UserDTO udto : list) {
			System.out.print("\t" + udto.getId());
			System.out.print("\t" + udto.getFirstName());
			System.out.print("\t" + udto.getLastName());
			System.out.print("\t" + udto.getLogin());
			System.out.println("\t" + udto.getPassword());
		}

	}

}