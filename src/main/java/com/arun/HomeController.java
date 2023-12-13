package com.arun;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServlet;



@Controller
public class HomeController 
{
	@RequestMapping("/")
	@ResponseBody
	public String Hi()
	{
		return "Hello Welcome";
	}
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("num1") int i,@RequestParam("num2")int j,Model m)
	{
		int k=i+j;
		m.addAttribute("num3", k);
		return "result.jsp";
	}

}
