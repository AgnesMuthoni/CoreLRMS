package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.PersonAttribute;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface PersonAttributeService {
	public void createPersonAttribute(PersonAttribute personAttribute);

	public List<PersonAttribute> getAllPersonAttributes();

	public PersonAttribute getPersonAttributeById(int personAttributeId);

	public void deletePersonAttribute(PersonAttribute personAttribute);
}
