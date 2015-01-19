package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.DocumentsIdDAO;
import org.vetech.lrms.core.models.DocumentsId;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class DocumentsIdDAOImpl implements DocumentsIdDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void createDocumentId(DocumentsId documentsId) {
		sessionFactory.getCurrentSession().save(documentsId);
	}

	@SuppressWarnings("unchecked")
	@Override public List<DocumentsId> getAllDocIds() {
		return (List<DocumentsId>) sessionFactory.getCurrentSession().createCriteria(DocumentsId.class).list();
	}

	@Override public DocumentsId getDocId(int documentId) {
		return (DocumentsId) sessionFactory.getCurrentSession().get(DocumentsId.class, documentId);
	}

	@Override public void deleteDocumentId(DocumentsId documentsId) {
		sessionFactory.getCurrentSession().delete(documentsId);
	}
}
