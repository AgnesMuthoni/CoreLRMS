package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.PersonAttributeDAO;
import org.vetech.lrms.core.models.PersonAttribute;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class PersonAttributeDAOImpl implements PersonAttributeDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void createPersonAttribute(PersonAttribute personAttribute) {
		sessionFactory.getCurrentSession().save(personAttribute);
	}

	@SuppressWarnings("unchecked")
	@Override public List<PersonAttribute> getAllPersonAttributes() {
		return (List<PersonAttribute>) sessionFactory.getCurrentSession().createCriteria(PersonAttribute.class).list();
	}

	@Override public PersonAttribute getPersonAttributeById(int personAttributeId) {
		return (PersonAttribute) sessionFactory.getCurrentSession().get(PersonAttribute.class, personAttributeId);
	}

	@Override public void deletePersonAttribute(PersonAttribute personAttribute) {
		sessionFactory.getCurrentSession().delete(personAttribute);
	}
}
