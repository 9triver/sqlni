package com.kekwy.sqlni.example.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * description
 *
 * @author Kekwy
 * @version 1.0
 * @since 2024/1/3 13:44
 */
public class SqlSessionUtils {

    public static SqlSession getSqlSession() {
        // 加载核心配置文件
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 获取 SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 获取 sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        // 获取 SqlSession
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSessionFactory.openSession(true); // 设置事务的自动提交
    }

}
