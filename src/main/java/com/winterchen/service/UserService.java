package com.winterchen.service;

import com.github.pagehelper.PageInfo;
import com.winterchen.model.User;

/**
 * Created by Administrator on 2018/4/19.
 */
public interface UserService {

    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}