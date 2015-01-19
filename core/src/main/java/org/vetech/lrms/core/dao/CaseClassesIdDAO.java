package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.CaseClassesId;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface CaseClassesIdDAO {
	public void addCaseClassId(CaseClassesId caseClassesId);

	public List<CaseClassesId> getAllCaseClassIds();

	public CaseClassesId getCaseClassId(int caseClassId);

	public void deleteCaseClassId(CaseClassesId caseClassesId);
}
