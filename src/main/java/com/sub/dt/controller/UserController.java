package com.sub.dt.controller;

import com.sub.dt.pojo.User;
import com.sub.dt.service.IUserService;
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

	/**
	 * 访问路径http://localhost:8080/user/queryUser?userNum=wergsgdf3243
	 * 传入参数未userNum=wergsgdf3243
	 * @param request
	 * @param model
	 * @param user
	 * @return
	 */
	@RequestMapping("/queryUser")
	public String toIndex(HttpServletRequest request,Model model,User user){
		User userDb = this.userService.selectByUserNum(user);
		model.addAttribute("user", userDb);
		return "queryUser";
	}
}
