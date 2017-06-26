package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/a")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
	@RequestMapping(value = "method",method = RequestMethod.GET)
	public String method(@RequestParam("username") String username,
						 @RequestParam("password") String password,
						 HttpServletRequest request)
	{
		System.out.println("come from the page \n" + username + "\n" + password);
		request.getSession().setAttribute("name", username);
		request.getSession().setAttribute("password",password);
		return "success";
	}
}