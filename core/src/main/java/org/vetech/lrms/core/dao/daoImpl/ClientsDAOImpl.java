package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.ClientsDAO;
import org.vetech.lrms.core.models.Clients;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class ClientsDAOImpl implements ClientsDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void createClient(Clients clients) {
		sessionFactory.getCurrentSession().save(clients);
	}

	@SuppressWarnings("unchecked")
	@Override public List<Clients> getAllClients() {
		return (List<Clients>) sessionFactory.getCurrentSession().createCriteria(Clients.class).list();
	}

	@Override public Clients getClient(int clientId) {
		return (Clients) sessionFactory.getCurrentSession().get(Clients.class, clientId);
	}

	@Override public void deleteClient(Clients clients) {
		sessionFactory.getCurrentSession().delete(clients);
	}
}
