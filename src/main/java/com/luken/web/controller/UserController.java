package com.luken.web.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luken.helper.UserDataHelper;
import com.luken.model.UserData;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserDataHelper userDataHelper;
	@RequestMapping( path ={"/", ""}, method = {RequestMethod.GET})
	public String user() {
		return "User Page !";
	}
	
	@RequestMapping( path ={"/userInfoList"}, method = {RequestMethod.GET})
	public List<UserData> getUserInfoList(HttpSession session,@RequestParam String keyword) {
		return userDataHelper.queryUsers(keyword);
	}
}
