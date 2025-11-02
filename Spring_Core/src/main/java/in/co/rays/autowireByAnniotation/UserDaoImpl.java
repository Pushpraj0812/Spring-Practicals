package in.co.rays.autowireByAnniotation;

import org.springframework.stereotype.Repository;

@Repository // This annotation is used on class that perform CRUD operations
public class UserDaoImpl implements UserDaoInt {

	public void add() {

		System.out.println("add method.....");

	}
}