package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.DocumentLending;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface DocumentLendingDAO {
	public void createDocLending(DocumentLending documentLending);

	public List<DocumentLending> getAllDocLends();

	public DocumentLending getDocLend(int documentLendId);

	public void deleteDocLend(DocumentLending documentLending);
}
