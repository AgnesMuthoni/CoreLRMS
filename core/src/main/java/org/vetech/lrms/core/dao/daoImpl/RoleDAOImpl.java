package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.RoleDAO;
import org.vetech.lrms.core.models.Role;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class RoleDAOImpl implements RoleDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override public void addNewRole(Role role) {
		sessionFactory.getCurrentSession().save(role);
	}

	@SuppressWarnings("unchecked")
	@Override public List<Role> getAllRoles() {
		return (List<Role>) sessionFactory.getCurrentSession().createCriteria(Role.class).list();
	}

	@Override public Role getRole(int id) {
		return (Role) sessionFactory.getCurrentSession().get(Role.class, id);
	}

	@Override public void deleteRole(Role role) {
		sessionFactory.getCurrentSession().delete(role);
	}
}
