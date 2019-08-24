package org.orgw.simples.service;

import org.orgw.simples.core.exception.BaseException;
import org.orgw.simples.data.ProfileRequest;
import org.orgw.simples.data.ProfileResponse;

public interface IProfileService {

	

	ProfileResponse addProfile(ProfileRequest request) throws BaseException;

	ProfileResponse profileRequest(ProfileRequest request) throws BaseException;

	
}
