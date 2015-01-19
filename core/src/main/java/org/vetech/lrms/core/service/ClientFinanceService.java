package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.ClientFinance;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface ClientFinanceService {
	public void addClientFinance(ClientFinance clientFinance);

	public List<ClientFinance> getAllClientFinance();

	public ClientFinance getClientFinance(int clientFinanceId);

	public void deleteClientFinance(ClientFinance clientFinance);
}
