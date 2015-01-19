package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.CaseClasses;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface CaseClassesService {
	public void addCaseClasses(CaseClasses caseClasses);

	public List<CaseClasses> getAllCaseClasses();

	public CaseClasses getCaseClass(int CaseClassesId);

	public void deleteCaseClass(CaseClasses caseClasses);
}
