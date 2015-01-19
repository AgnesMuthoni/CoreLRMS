package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.DocumentsId;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface DocumentsIdService {
	public void createDocumentId(DocumentsId documentsId);

	public List<DocumentsId> getAllDocIds();

	public DocumentsId getDocId(int documentId);

	public void deleteDocumentId(DocumentsId documentsId);
}
