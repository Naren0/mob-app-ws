package com.naren.app.ws.userservices;

import com.naren.app.ws.ui.model.request.UserDetailsRequestModel;
import com.naren.app.ws.ui.model.response.UserRest;

public interface UserService {
	
	UserRest createUser(UserDetailsRequestModel userDetails);
	

}
