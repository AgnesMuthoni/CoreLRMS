package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.Clients;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface ClientsService {
	public void createClient(Clients clients);

	public List<Clients> getAllClients();

	public Clients getClient(int clientId);

	public void deleteClient(Clients clients);
}
