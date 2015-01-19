package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.Employees;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface EmployeesDAO {
	public void createEmployee(Employees employees);

	public List<Employees> getAllEmployees();

	public Employees getEmployee(int employeeId);

	public void deleteEmployee(Employees employees);
}
