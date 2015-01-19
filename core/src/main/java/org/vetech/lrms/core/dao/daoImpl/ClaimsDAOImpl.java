package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.ClaimsDAO;
import org.vetech.lrms.core.models.Claims;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class ClaimsDAOImpl implements ClaimsDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void addClaim(Claims claims) {
		sessionFactory.getCurrentSession().save(claims);
	}

	@SuppressWarnings("unchecked")
	@Override public List<Claims> getAllClaims() {
		return (List<Claims>) sessionFactory.getCurrentSession().createCriteria(Claims.class).list();
	}

	@Override public Claims getClaim(int claimId) {
		return (Claims) sessionFactory.getCurrentSession().get(Claims.class, claimId);
	}

	@Override public void deleteClaim(Claims claims) {
		sessionFactory.getCurrentSession().delete(claims);
	}
}
