package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.EmpExpenditure;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface EmpExpenditureDAO {
	public void addExpenditure(EmpExpenditure empExpenditure);

	public List<EmpExpenditure> getAllExpenditure();

	public EmpExpenditure getExpenditure(int expId);

	public void deleteExpense(EmpExpenditure empExpenditure);
}
