package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.CaseClassesId;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface CaseClassesIdService {
	public void addCaseClassId(CaseClassesId caseClassesId);

	public List<CaseClassesId> getAllCaseClassIds();

	public CaseClassesId getCaseClassId(int caseClassId);

	public void deleteCaseClassId(CaseClassesId caseClassesId);
}
