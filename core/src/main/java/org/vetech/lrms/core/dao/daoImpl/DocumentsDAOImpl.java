package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.DocumentsDAO;
import org.vetech.lrms.core.models.Documents;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class DocumentsDAOImpl implements DocumentsDAO{
	@Autowired
	SessionFactory sessionFactory;

	@Override public void createDocument(Documents documents) {
		sessionFactory.getCurrentSession().save(documents);
	}

	@SuppressWarnings("unchecked")
	@Override public List<Documents> getAllDocuments() {
		return (List<Documents>) sessionFactory.getCurrentSession().createCriteria(Documents.class).list();
	}

	@Override public Documents getDocument(int documentId) {
		return (Documents) sessionFactory.getCurrentSession().get(Documents.class, documentId);
	}

	@Override public void deleteDocument(Documents documents) {
		sessionFactory.getCurrentSession().delete(documents);
	}
}
