package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.Employees;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface EmployeesService {
	public void createEmployee(Employees employees);

	public List<Employees> getAllEmployees();

	public Employees getEmployee(int employeeId);

	public void deleteEmployee(Employees employees);
}
