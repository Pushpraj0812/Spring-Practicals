package in.co.rays.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.rays.dto.UserDTO;

@Repository
public class UserDAOHibImpl implements UserDAOInt {

	@Autowired
	private SessionFactory sessionFactory = null;

	public long add(UserDTO dto) {

		Session session = sessionFactory.getCurrentSession();
		long pk = (Long) session.save(dto);
		return pk;
	}

	public void update(UserDTO dto) {

		Session session = sessionFactory.getCurrentSession();
		sessionFactory.getCurrentSession().update(dto);
	}

	public void delete(UserDTO dto) {

		Session session = sessionFactory.getCurrentSession();
		sessionFactory.getCurrentSession().delete(dto);

	}

	public UserDTO findByPk(long pk) {
		UserDTO dto = sessionFactory.getCurrentSession().get(UserDTO.class, pk);
		return dto;
	}

	public UserDTO findByLogin(String login) {

		List list = null;
		UserDTO dto = null;

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);
		criteria.add(Restrictions.eq("login", login));
		list = criteria.list();

		if (list.size() == 1) {
			dto = (UserDTO) list.get(0);
		}

		return dto;
	}

	public UserDTO authenticate(String login, String password) {

		List list = null;
		UserDTO dto = null;

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);
		criteria.add(Restrictions.eq("login", login));
		criteria.add(Restrictions.eq("password", password));
		list = criteria.list();

		if (list.size() == 1) {
			dto = (UserDTO) list.get(0);
		}

		return dto;
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {

		List list = null;

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);
		if (dto != null) {
			if (dto.getFirstName() != null && dto.getFirstName().length() > 0) {
				criteria.add(Restrictions.like("firstName", dto.getFirstName()));
			}
		}

		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			criteria.setFirstResult(pageNo);
			criteria.setMaxResults(pageSize);
		}

		list = criteria.list();

		return list;
	}
}