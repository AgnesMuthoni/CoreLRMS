package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.PersonAddressDAO;
import org.vetech.lrms.core.models.PersonAddress;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class PersonAddressDAOImpl implements PersonAddressDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void createPersonAddress(PersonAddress personAddress) {
		sessionFactory.getCurrentSession().save(personAddress);
	}

	@SuppressWarnings("unchecked")
	@Override public List<PersonAddress> getAllAdresses() {
		return (List<PersonAddress>) sessionFactory.getCurrentSession().createCriteria(PersonAddress.class).list();
	}

	@Override public PersonAddress getAddressById(int personAddressId) {
		return (PersonAddress) sessionFactory.getCurrentSession().get(PersonAddress.class, personAddressId);
	}

	@Override public void deletePersonAdress(PersonAddress personAddress) {
		sessionFactory.getCurrentSession().delete(personAddress);
	}
}
