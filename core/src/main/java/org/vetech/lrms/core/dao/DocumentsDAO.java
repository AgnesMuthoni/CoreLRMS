package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.Documents;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface DocumentsDAO {
	public void createDocument(Documents documents);

	public List<Documents> getAllDocuments();

	public Documents getDocument(int documentId);

	public void deleteDocument(Documents documents);
}
