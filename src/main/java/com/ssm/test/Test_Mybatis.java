package com.ssm.test;

import com.ssm.dao.AccountDao;
import com.ssm.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test_Mybatis {
    @Test
    public void test() throws IOException {
//        加载配置文件
        InputStream in = Resources.getResourceAsStream("spring-mybatis.xml");
//        创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//        创建SqlSession对象
        SqlSession session = factory.openSession();
//        获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
//        查询所有数据
        List<User> list = dao.selectAll();
        for(User user:list){
            System.out.println(user);
        }
//        关闭资源
        session.close();
        in.close();
    }
}