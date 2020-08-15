package com.naren.app.ws.userservices.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.naren.app.ws.ui.model.request.UserDetailsRequestModel;
import com.naren.app.ws.ui.model.response.UserRest;
import com.naren.app.ws.userservices.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	Map<String, UserRest> users;

	@Override
	public UserRest createUser(UserDetailsRequestModel userDetailsRequestModel) {
		UserRest returnValue = new UserRest();

		returnValue.setEmail(userDetailsRequestModel.getEmail());
		returnValue.setFirstName(userDetailsRequestModel.getFirstName());
		returnValue.setLastName(userDetailsRequestModel.getLastName());

		String userId = UUID.randomUUID().toString();
		returnValue.setUserId(userId);

		if (users == null)
			users = new HashMap<>();
		users.put(userId, returnValue);
		
		return returnValue;
	}
	
	
	

}
