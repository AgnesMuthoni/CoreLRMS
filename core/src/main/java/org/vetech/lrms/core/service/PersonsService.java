package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.Persons;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public interface PersonsService {
	public void addNewPerson(Persons persons);

	public List<Persons> getAllPersons();

	public Persons getPerson(int personId);

	public void deletePerson(Persons persons);
}
