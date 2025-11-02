package in.co.rays.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestPerson {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("person.xml"));

		// classpathresource me jis xml ki bean chiye uska path
		// xmlbeanfactory ka kaam he bean banana
		// beanfactory khud se bean provide karti he

		Person p = (Person) factory.getBean("person");

		// BeanFactory ki method getbean bean provide karti he

		System.out.println("person's name: " + p.getName());
		System.out.println("person's address: " + p.getAddress());

	}
}