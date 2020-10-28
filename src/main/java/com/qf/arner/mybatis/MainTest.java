package com.qf.arner.mybatis;

import com.qf.arner.mybatis.entity.Order;
import com.qf.arner.mybatis.entity.User;
import com.qf.arner.mybatis.mapper.OrderMapper;
import com.qf.arner.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MainTest {
    public static void main(String[] args) {
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(MainTest.class.getClassLoader()
                .getResourceAsStream("mybatis-config.xml"));
        SqlSession sqlSession = ssf.openSession(true);
        /*OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
//        一对一查询
        Order order = mapper.selectOrderByNo(1);
        System.out.println(order);*/

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectAddressByUserId(1);
        System.out.println(user);
    }

}
