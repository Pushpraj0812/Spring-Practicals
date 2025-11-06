package in.co.rays.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.rays.dao.UserDAOInt;
import in.co.rays.dto.UserDTO;

@Service
public class UserServiceimpl implements UserServiceInt {

	@Autowired
	private UserDAOInt dao;

	@Transactional(propagation = Propagation.REQUIRED)
	public long add(UserDTO dto) throws Exception {

		UserDTO existDto = findByLogin(dto.getLogin());

		if (existDto != null) {
			throw new Exception("duplicate record exception");
		}

		long pk = dao.add(dto);
		return pk;
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void update(UserDTO dto) {
		dao.update(dto);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void delete(long id) {
		dao.delete(id);
	}

	public UserDTO findByLogin(String login) {
		return dao.findByLogin(login);
	}

	public UserDTO authenticate(String login, String password) {
		return dao.authenticate(login, password);
	}

	public List search(UserDTO dto) {
		return dao.search(dto);
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		return dao.search(dto, pageNo, pageSize);
	}
}