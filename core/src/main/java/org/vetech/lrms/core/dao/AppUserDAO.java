package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.AppUser;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface AppUserDAO {
	public void addAppUser(AppUser appUser);

	public List<AppUser> getAppUsers();

	public AppUser getAppUser(int id);

	public void deleteAppUser(AppUser appUser);
}
