package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.PersonName;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface PersonNameService {
	public void createPersonName(PersonName personName);

	public List<PersonName> getAllPersonNames();

	public PersonName getPersonNameById(Integer personNameId);

	public void deletePersonName(PersonName personName);
}
