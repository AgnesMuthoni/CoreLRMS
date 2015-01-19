package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.EmployeesDAO;
import org.vetech.lrms.core.models.Employees;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class EmployeesDAOImpl implements EmployeesDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void createEmployee(Employees employees) {
		sessionFactory.getCurrentSession().save(employees);
	}

	@SuppressWarnings("unchecked")
	@Override public List<Employees> getAllEmployees() {
		return (List<Employees>) sessionFactory.getCurrentSession().createCriteria(Employees.class).list();
	}

	@Override public Employees getEmployee(int employeeId) {
		return (Employees) sessionFactory.getCurrentSession().get(Employees.class, employeeId);
	}

	@Override public void deleteEmployee(Employees employees) {
		sessionFactory.getCurrentSession().delete(employees);
	}
}
