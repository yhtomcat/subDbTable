package com.sub.dt.dao;

import com.sub.dt.pojo.User;

public interface IUserDao {

    /**
     * @Description
     * @Autohr supers【weChat:15200095880】
     */
    int insertUser(User user);

    /**
     * @Description
     * @Autohr supers【weChat:15200095880】
     */
    int deleteByuserNum(User user);

    /**
     * @Description
     * @Autohr supers【weChat:15200095880】
     */
    int updateByUserNum(User user);

    /**
     * @Description
     * @Autohr supers【weChat:15200095880】
     */
    User selectByUserNum(User user);
}