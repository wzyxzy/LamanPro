package com.wzy.lamanpro.bean;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.wzy.lamanpro.bean.Users;

import com.wzy.lamanpro.bean.UsersDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig usersDaoConfig;

    private final UsersDao usersDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        usersDaoConfig = daoConfigMap.get(UsersDao.class).clone();
        usersDaoConfig.initIdentityScope(type);

        usersDao = new UsersDao(usersDaoConfig, this);

        registerDao(Users.class, usersDao);
    }
    
    public void clear() {
        usersDaoConfig.clearIdentityScope();
    }

    public UsersDao getUsersDao() {
        return usersDao;
    }

}
