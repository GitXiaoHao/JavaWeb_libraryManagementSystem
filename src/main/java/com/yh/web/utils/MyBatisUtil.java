package com.yh.web.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 作者 小豪<p>
 * 时间 2022/11/26<p>
 *
 * @author yu<p>
 */
public class MyBatisUtil {
    public static final SqlSession SESSION;

    static {
        SESSION = getSqlSession();
    }

    private MyBatisUtil() {
    }

    /**
     * @return 获取sqlSession
     */
    private static SqlSession getSqlSession() {
        //加载配置文件 得到SqlSessionFactory
        String resource = "mybatis-config.xml";
        SqlSession sqlSession;
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            //获取SqlSession对象
            sqlSession = factory.openSession();
            return sqlSession;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 关闭
     */
    public static void closeSession() {
        try {
            SESSION.close();
            System.out.println("session已关闭");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 提交
     */
    public static void submitSession() {
        try {
            SESSION.commit();
            System.out.println("session已提交");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void rollBack(){
        SESSION.rollback();
    }
}
