package in.co.rays.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonEmployee {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("multi.xml");

		Person p = context.getBean("person", Person.class); // By defining class name we do not need to typecast it.

		System.out.println(p.getName());
		System.out.println(p.getAddress());

		Employee e = context.getBean("employee", Employee.class);

		System.out.println(e.getEmpName());
		System.out.println(e.getSalary());
	}
}