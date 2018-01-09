package com.test.lp.dao;

import com.test.lp.User;

/**
 * Dao
 */
public interface UserDao  {

    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public void deleteUserById(Long id);

}