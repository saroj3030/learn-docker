package com.saroj.docker;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public UserModel getUser(UserModel model) {
		UserModel userModel = new UserModel();
		userModel.setMobile("9620521051");
		userModel.setName("Saroj");
		userModel.setUserGuid(UUID.randomUUID().toString());
		return userModel;
	}

}
