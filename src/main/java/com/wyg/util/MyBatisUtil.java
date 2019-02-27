package com.wyg.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory factory;

    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //open一个sqlsession
    public static SqlSession getSqlSession() {
        return factory.openSession(false);  //true为自动提交事务
    }

    //关闭sqlsession
    public static void closeSqlSession(SqlSession session) {
        if (session != null) {
            session.close();
        }
    }

}
