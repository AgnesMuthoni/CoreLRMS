package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.EmpExpenditure;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface EmpExpenditureService {
	public void addExpenditure(EmpExpenditure empExpenditure);

	public List<EmpExpenditure> getAllExpenditure();

	public EmpExpenditure getExpenditure(int expId);

	public void deleteExpense(EmpExpenditure empExpenditure);
}
