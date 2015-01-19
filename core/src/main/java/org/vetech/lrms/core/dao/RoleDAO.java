package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.Role;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public interface RoleDAO {
	public void addNewRole(Role role);

	public List<Role> getAllRoles();

	public Role getRole(int id);

	public void deleteRole(Role role);
}
