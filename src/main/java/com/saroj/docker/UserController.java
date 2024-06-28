package com.saroj.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUser")
	public ResponseEntity<UserModel> getUser(@RequestBody UserModel model) {
		UserModel userModel = userService.getUser(model);
		return new ResponseEntity<>(userModel, HttpStatus.OK);
	}

}
