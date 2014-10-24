package com.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.IUserDao;
import com.spring.dao.common.IOperations;
import com.spring.entity.TUser;
import com.spring.service.IUserService;
import com.spring.service.common.AbstractService;

@Service("userService")
public class UserService extends AbstractService<TUser> implements IUserService {

    @Resource(name="usersDao")
    private IUserDao dao;
    
    public UserService() {
        super();
    }

    @Override
    protected IOperations<TUser> getDao() {
        return this.dao;
    }
}