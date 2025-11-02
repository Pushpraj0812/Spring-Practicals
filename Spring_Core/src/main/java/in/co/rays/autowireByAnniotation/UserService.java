package in.co.rays.autowireByAnniotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // This annotation is used for the service class
public class UserService {

	@Autowired // This annotation is used to define autowire in spring
	private UserDaoInt userDao;

	public void setUserDao(UserDaoInt userDao) {
		this.userDao = userDao;
	}

	public void testAdd() {
		userDao.add();
	}
}