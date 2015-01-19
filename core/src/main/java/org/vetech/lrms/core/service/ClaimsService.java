package org.vetech.lrms.core.service;

import org.vetech.lrms.core.models.Claims;

import java.util.List;

/**
 * Created by alex on 1/17/15.
 */
public interface ClaimsService {
	public void addClaim(Claims claims);

	public List<Claims> getAllClaims();

	public Claims getClaim(int claimId);

	public void deleteClaim(Claims claims);
}
