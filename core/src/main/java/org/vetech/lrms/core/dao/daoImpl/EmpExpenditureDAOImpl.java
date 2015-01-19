package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.EmpExpenditureDAO;
import org.vetech.lrms.core.models.EmpExpenditure;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class EmpExpenditureDAOImpl implements EmpExpenditureDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void addExpenditure(EmpExpenditure empExpenditure) {
		sessionFactory.getCurrentSession().save(empExpenditure);
	}

	@SuppressWarnings("unchecked")
	@Override public List<EmpExpenditure> getAllExpenditure() {
		return (List<EmpExpenditure>) sessionFactory.getCurrentSession().createCriteria(EmpExpenditure.class).list();
	}

	@Override public EmpExpenditure getExpenditure(int expId) {
		return (EmpExpenditure) sessionFactory.getCurrentSession().get(EmpExpenditure.class, expId);
	}

	@Override public void deleteExpense(EmpExpenditure empExpenditure) {
		sessionFactory.getCurrentSession().delete(empExpenditure);
	}
}
