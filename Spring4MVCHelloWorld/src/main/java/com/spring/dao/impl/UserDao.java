package com.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.spring.dao.IUserDao;
import com.spring.dao.common.AbstractHibernateDao;
import com.spring.entity.TUser;


@Repository("usersDao")
public class UserDao extends AbstractHibernateDao<TUser> implements IUserDao {

    public UserDao() {
        super();
        setClazz(TUser.class);
    }
}