package com.sub.dt.service;

import com.sub.dt.pojo.User;

/**
 * @Description
 * @Autohr supers【weChat:15200095880】
 */
public interface IUserService {

	/**
	 * @Description
	 * @Autohr supers【weChat:15200095880】
	 */
	public int insertUser(User user);

	/**
	 * @Description
	 * @Autohr supers【weChat:15200095880】
	 */
	public int deleteByuserNum(User user);

	/**
	 * @Description
	 * @Autohr supers【weChat:15200095880】
	 */
	public int updateByUserNum(User user);

	/**
	 * @Description
	 * @Autohr supers【weChat:15200095880】
	 */
	public User selectByUserNum(User user);


}
