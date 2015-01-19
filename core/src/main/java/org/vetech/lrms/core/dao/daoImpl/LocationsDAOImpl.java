package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.LocationsDAO;
import org.vetech.lrms.core.models.Locations;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class LocationsDAOImpl implements LocationsDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void createLocation(Locations locations) {
		sessionFactory.getCurrentSession().save(locations);
	}

	@SuppressWarnings("unchecked")
	@Override public List<Locations> getAllLocations() {
		return (List<Locations>) sessionFactory.getCurrentSession().createCriteria(Locations.class).list();
	}

	@Override public Locations getLocationById(int locID) {
		return (Locations) sessionFactory.getCurrentSession().get(Locations.class, locID);
	}

	@Override public void deleteLocation(Locations locations) {
		sessionFactory.getCurrentSession().delete(locations);
	}
}
