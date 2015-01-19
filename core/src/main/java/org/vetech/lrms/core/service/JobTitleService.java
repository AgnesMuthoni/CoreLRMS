package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.JobTitle;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface JobTitleService {
	public void createJobTitle(JobTitle jobTitle);

	public List<JobTitle> getAllTitles();

	public JobTitle getTitle(int jobTitleId);

	public void deleteJobTitle(JobTitle jobTitle);
}
