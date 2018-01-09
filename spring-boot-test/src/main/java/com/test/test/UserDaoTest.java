package com.test.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.test.lp.User;
import com.test.lp.dao.UserDao;

/**
 * 测试 lp
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSaveUser() throws Exception {
        User user=new User();
        user.setId(1l);
        user.setUserName("tulinggu");
        user.setPassWord("000000");
        userDao.saveUser(user);
    }

    @Test
    public void findUserByUserName(){
       User user= userDao.findUserByUserName("tulinggu");
       System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> user is "+user);
    }


    @Test
    public void deleteUserById(){
        userDao.deleteUserById(1l);
    }

}