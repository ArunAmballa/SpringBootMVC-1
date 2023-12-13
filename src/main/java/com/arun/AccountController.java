package com.arun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController 
{ 
	@RequestMapping("/account")
	@ResponseBody
	public String account()
	{
		return "welcome to Account Controller";
	}

}
 