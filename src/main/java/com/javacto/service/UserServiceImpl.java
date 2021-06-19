package com.javacto.service;

import com.javacto.dao.UserDao;
import com.javacto.dao.UserDaoImpl;
import com.javacto.po.User;
import com.javacto.utils.PageInfo;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
    @Override
    public int getTotalCount(User user) {
        return userDao.getTotalCount(user);
    }

    @Override
    public List<User> getPageUser(PageInfo pageInfo, User user) {
        return userDao.getPageUser(pageInfo,user);
    }
}
