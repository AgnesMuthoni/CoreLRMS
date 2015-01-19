package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.Locations;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface LocationsDAO {
	public void createLocation(Locations locations);

	public List<Locations> getAllLocations();

	public Locations getLocationById(int locID);

	public void deleteLocation(Locations locations);
}
