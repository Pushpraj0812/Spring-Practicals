package in.co.rays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.rays.dao.UserDAOInt;
import in.co.rays.dto.UserDTO;

@Service
public class UserServiceHibImpl implements UserServiceInt {

	@Autowired
	private UserDAOInt dao = null;

	@Transactional(propagation = Propagation.REQUIRED)
	public long add(UserDTO dto) {

		return dao.add(dto);
	}

}