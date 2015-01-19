package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.AppUserDAO;
import org.vetech.lrms.core.models.AppUser;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class AppUserDAOImpl implements AppUserDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void addAppUser(AppUser appUser) {
		sessionFactory.getCurrentSession().save(appUser);
	}

	@SuppressWarnings("unchecked")
	@Override public List<AppUser> getAppUsers() {
		return (List<AppUser>) sessionFactory.getCurrentSession().createCriteria(AppUser.class).list();
	}

	@Override public AppUser getAppUser(int id) {
		return (AppUser) sessionFactory.getCurrentSession().get(AppUser.class, id);
	}

	@Override public void deleteAppUser(AppUser appUser) {
		sessionFactory.getCurrentSession().delete(appUser);
	}
}
