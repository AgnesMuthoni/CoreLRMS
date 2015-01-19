package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.PersonNameDAO;
import org.vetech.lrms.core.models.PersonName;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class PersonNameDAOImpl implements PersonNameDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void createPersonName(PersonName personName) {
		sessionFactory.getCurrentSession().save(personName);
	}

	@SuppressWarnings("unchecked")
	@Override public List<PersonName> getAllPersonNames() {
		return (List<PersonName>) sessionFactory.getCurrentSession().createCriteria(PersonName.class).list();
	}

	@Override public PersonName getPersonNameById(Integer personNameId) {
		return (PersonName) sessionFactory.getCurrentSession().get(PersonName.class, personNameId);
	}

	@Override public void deletePersonName(PersonName personName) {
		sessionFactory.getCurrentSession().delete(personName);
	}
}
