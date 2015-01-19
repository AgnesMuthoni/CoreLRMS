package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.PersonAttribute;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface PersonAttributeDAO {
	public void createPersonAttribute(PersonAttribute personAttribute);

	public List<PersonAttribute> getAllPersonAttributes();

	public PersonAttribute getPersonAttributeById(int personAttributeId);

	public void deletePersonAttribute(PersonAttribute personAttribute);
}
