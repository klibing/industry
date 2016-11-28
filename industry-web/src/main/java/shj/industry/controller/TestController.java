package shj.industry.controller;


import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import shj.industry.model.User;
import shj.industry.service.IUserService;


@RestController
@RequestMapping("/v1")
public class TestController {
	
	@Resource(name="userService")
	private IUserService userService;
	
	@RequestMapping("/toIndex")
	public String toIndex() {
		return "index";
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public User toJson(@PathVariable int id) {
		User user = userService.getUserById(id);
		return user;
	}
}
