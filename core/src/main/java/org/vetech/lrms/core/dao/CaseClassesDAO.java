package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.CaseClasses;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface CaseClassesDAO {
	public void addCaseClasses(CaseClasses caseClasses);

	public List<CaseClasses> getAllCaseClasses();

	public CaseClasses getCaseClass(int CaseClassesId);

	public void deleteCaseClass(CaseClasses caseClasses);
}
