package in.co.rays.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person") // This annotation is used to create bean manually
public class Person {
	
	@Value("Ram") // This annotation set value in the variable 
	private String name;

	@Value("Indore")
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}