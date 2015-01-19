package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.DocumentLending;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface DocumentLendingService {
	public void createDocLending(DocumentLending documentLending);

	public List<DocumentLending> getAllDocLends();

	public DocumentLending getDocLend(int documentLendId);

	public void deleteDocLend(DocumentLending documentLending);
}
