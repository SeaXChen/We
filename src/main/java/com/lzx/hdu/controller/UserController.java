package com.lzx.hdu.controller;

import com.lzx.hdu.pojo.User;
import com.lzx.hdu.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = userService.getUserByUsername(username);
		if (user != null && user.getPassword().equals(password)) {
			model.addAttribute("user", username);
			return "index";
		}else {
			model.addAttribute("error", "用户名或密码错误！");
			return "error";
		}
		
	}
	
}
