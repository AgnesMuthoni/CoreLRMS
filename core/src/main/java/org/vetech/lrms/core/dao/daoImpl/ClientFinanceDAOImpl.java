package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.ClientFinanceDAO;
import org.vetech.lrms.core.models.ClientFinance;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class ClientFinanceDAOImpl implements ClientFinanceDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void addClientFinance(ClientFinance clientFinance) {
		sessionFactory.getCurrentSession().save(clientFinance);
	}

	@SuppressWarnings("unchecked")
	@Override public List<ClientFinance> getAllClientFinance() {
		return (List<ClientFinance>) sessionFactory.getCurrentSession().createCriteria(ClientFinance.class).list();
	}

	@Override public ClientFinance getClientFinance(int clientFinanceId) {
		return (ClientFinance) sessionFactory.getCurrentSession().get(ClientFinance.class, clientFinanceId);
	}

	@Override public void deleteClientFinance(ClientFinance clientFinance) {
		sessionFactory.getCurrentSession().delete(clientFinance);
	}
}
