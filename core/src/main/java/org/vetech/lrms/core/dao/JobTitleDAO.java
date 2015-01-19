package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.JobTitle;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface JobTitleDAO {
	public void createJobTitle(JobTitle jobTitle);

	public List<JobTitle> getAllTitles();

	public JobTitle getTitle(int jobTitleId);

	public void deleteJobTitle(JobTitle jobTitle);
}
