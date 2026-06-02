package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main")  //common for all the end points
@RestController  //we can use use this instead of @controller and without the @responsebody
public class UserManagementController {

	//@RequestMapping(path = "/user/add",method = RequestMethod.POST)
	@PostMapping(path = "/user/add")
	public String addUser()
	{
		return "user added succcessfully";
	}
	//@RequestMapping(path = "/user/add",method = RequestMethod.POST)
		@GetMapping(path = "/user")
		public String getUser()
		{
			return "user get succcessfully";
		}
	//@RequestMapping(path = "/user/delete",method = RequestMethod.DELETE)
	@DeleteMapping(path = "/user/delete")
	public String deleteUser()
	{
		return "user deleted succcessfully";
	}
	//@RequestMapping(path = "/user/update",method = RequestMethod.PUT)
	@PutMapping(path = "/user/update")
	public String updateUser()
	{
		return "user Updated succcessfully";
	}
}
