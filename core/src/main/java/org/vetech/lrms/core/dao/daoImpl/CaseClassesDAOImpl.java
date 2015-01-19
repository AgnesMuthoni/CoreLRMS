package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.CaseClassesDAO;
import org.vetech.lrms.core.models.CaseClasses;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class CaseClassesDAOImpl implements CaseClassesDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void addCaseClasses(CaseClasses caseClasses) {
		sessionFactory.getCurrentSession().save(caseClasses);
	}

	@SuppressWarnings("unchecked")
	@Override public List<CaseClasses> getAllCaseClasses() {
		return (List<CaseClasses>) sessionFactory.getCurrentSession().createCriteria(CaseClasses.class).list();
	}

	@Override public CaseClasses getCaseClass(int CaseClassesId) {
		return (CaseClasses) sessionFactory.getCurrentSession().get(CaseClasses.class, CaseClassesId);
	}

	@Override public void deleteCaseClass(CaseClasses caseClasses) {
		sessionFactory.getCurrentSession().delete(caseClasses);
	}
}
