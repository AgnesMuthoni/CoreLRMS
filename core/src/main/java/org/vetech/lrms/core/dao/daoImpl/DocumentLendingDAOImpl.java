package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.DocumentLendingDAO;
import org.vetech.lrms.core.models.DocumentLending;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class DocumentLendingDAOImpl implements DocumentLendingDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void createDocLending(DocumentLending documentLending) {
		sessionFactory.getCurrentSession().save(documentLending);
	}

	@SuppressWarnings("unchecked")
	@Override public List<DocumentLending> getAllDocLends() {
		return (List<DocumentLending>) sessionFactory.getCurrentSession().createCriteria(DocumentLending.class).list();
	}

	@Override public DocumentLending getDocLend(int documentLendId) {
		return (DocumentLending) sessionFactory.getCurrentSession().get(DocumentLending.class, documentLendId);
	}

	@Override public void deleteDocLend(DocumentLending documentLending) {
		sessionFactory.getCurrentSession().delete(documentLending);
	}
}
