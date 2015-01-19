package org.vetech.lrms.core.dao.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.vetech.lrms.core.dao.JobTitleDAO;
import org.vetech.lrms.core.models.JobTitle;

import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class JobTitleDAOImpl implements JobTitleDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override public void createJobTitle(JobTitle jobTitle) {
		sessionFactory.getCurrentSession().save(jobTitle);
	}

	@SuppressWarnings("unchecked")
	@Override public List<JobTitle> getAllTitles() {
		return (List<JobTitle>) sessionFactory.getCurrentSession().createCriteria(JobTitle.class).list();
	}

	@Override public JobTitle getTitle(int jobTitleId) {
		return (JobTitle) sessionFactory.getCurrentSession().get(JobTitle.class, jobTitleId);
	}

	@Override public void deleteJobTitle(JobTitle jobTitle) {
		sessionFactory.getCurrentSession().delete(jobTitle);
	}
}
