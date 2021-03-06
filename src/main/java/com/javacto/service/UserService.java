package com.javacto.service;

import com.javacto.po.User;
import com.javacto.utils.PageInfo;

import java.util.List;

public interface UserService {
    //获取总条数
    public int getTotalCount(User user);
    //查询总条数
    public List<User> getPageUser(PageInfo pageInfo, User user);
}
