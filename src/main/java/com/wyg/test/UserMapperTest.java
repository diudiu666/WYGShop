package com.wyg.test;

import com.wyg.dao.UserMapper;
import com.wyg.pojo.User;
import com.wyg.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {
    //log4j
    private static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void testLogin(){
        SqlSession session = MyBatisUtil.getSqlSession();
        List<User> userList = session.getMapper(UserMapper.class).login();
        for (User u : userList){
            logger.info(u.getName());
        }
    }


}