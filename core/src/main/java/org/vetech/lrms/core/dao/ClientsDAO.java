package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.Clients;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface ClientsDAO {
	public void createClient(Clients clients);

	public List<Clients> getAllClients();

	public Clients getClient(int clientId);

	public void deleteClient(Clients clients);
}
