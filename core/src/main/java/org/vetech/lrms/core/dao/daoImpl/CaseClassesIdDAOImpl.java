package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.CaseClassesIdDAO;
import org.vetech.lrms.core.models.CaseClassesId;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class CaseClassesIdDAOImpl implements CaseClassesIdDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void addCaseClassId(CaseClassesId caseClassesId) {
		sessionFactory.getCurrentSession().save(caseClassesId);
	}

	@SuppressWarnings("unchecked")
	@Override public List<CaseClassesId> getAllCaseClassIds() {
		return (List<CaseClassesId>) sessionFactory.getCurrentSession().createCriteria(CaseClassesId.class).list();
	}

	@Override public CaseClassesId getCaseClassId(int caseClassId) {
		return (CaseClassesId) sessionFactory.getCurrentSession().get(CaseClassesId.class, caseClassId);
	}

	@Override public void deleteCaseClassId(CaseClassesId caseClassesId) {
		sessionFactory.getCurrentSession().delete(caseClassesId);
	}
}
