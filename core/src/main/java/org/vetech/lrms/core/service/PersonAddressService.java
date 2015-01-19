package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.PersonAddress;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface PersonAddressService {
	public void createPersonAddress(PersonAddress personAddress);

	public List<PersonAddress> getAllAdresses();

	public PersonAddress getAddressById(int personAddressId);

	public void deletePersonAdress(PersonAddress personAddress);
}
