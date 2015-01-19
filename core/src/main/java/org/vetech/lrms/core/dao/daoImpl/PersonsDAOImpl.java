package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.PersonsDAO;
import org.vetech.lrms.core.models.Persons;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class PersonsDAOImpl implements PersonsDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void addNewPerson(Persons persons) {
		sessionFactory.getCurrentSession().save(persons);
	}

	@SuppressWarnings("unchecked")
	@Override public List<Persons> getAllPersons() {
		return (List<Persons>) sessionFactory.getCurrentSession().createCriteria(Persons.class).list();
	}

	@Override public Persons getPerson(int personId) {
		return (Persons) sessionFactory.getCurrentSession().get(Persons.class, personId);
	}

	@Override public void deletePerson(Persons persons) {
		sessionFactory.getCurrentSession().delete(persons);
	}
}
