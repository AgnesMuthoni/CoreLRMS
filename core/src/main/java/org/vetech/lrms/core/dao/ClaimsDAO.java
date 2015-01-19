package org.vetech.lrms.core.dao;

import org.vetech.lrms.core.models.Claims;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface ClaimsDAO {
	public void addClaim(Claims claims);

	public List<Claims> getAllClaims();

	public Claims getClaim(int claimId);

	public void deleteClaim(Claims claims);
}
