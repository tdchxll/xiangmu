package com.javacto.dao;

import com.javacto.utils.PageInfo;
import com.javacto.po.User;

import java.util.List;

public interface UserDao {
    //获取总条数
    public int getTotalCount(User user);
    //查询总条数
    public List<User> getPageUser(PageInfo pageInfo, User user);
}
