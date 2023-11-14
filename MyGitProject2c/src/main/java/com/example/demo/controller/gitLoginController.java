
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class  gitLoginController{

	//一覧表示用
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String viewPage() {

		return "gitlogin";
	}
	
	

	//ログイン検証用
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.POST)
	public String loginPost(String id, String password) {

		if ("gitlogin".equals(id) && "gitpw".equals(password)) {
	        
	        return "redirect:/gititemlist";
	    } else {
	        
	        return "redirect:/gitlogin";
	    }

		
	}
}