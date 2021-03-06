package com.mybatis.SurpriseWang;

import com.mybatis.SurpriseWang.POJO.User;
import com.mybatis.SurpriseWang.POJO.UserExample;
import com.mybatis.SurpriseWang.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import vc.helloworld.mybatis.util.MyBatisUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2019/11/29 0029 11:01
 * @Created by /SurpriseWang
 */
public class MyBatisTest {
    private InputStream inputStream;
    private UserMapper userMapper;
    private MyBatisUtil myBatisUtil;
    private SqlSession session;

    @Before
    public void before() throws IOException {
        //1.读取配置文件，生成字节输入流
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //3.使用工厂对象，创建dao对象
        session = factory.openSession();
        userMapper = session.getMapper(UserMapper.class);
    }

    @After
    public void after() throws IOException {
        inputStream.close();
    }

    @Test
    //声明传入多个参数的查询
    public void selectByIdWithExample() {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        List<Integer> userIds = new ArrayList<Integer>();
        userIds.add(1);
        userIds.add(2);
        criteria.andIdIn(userIds);
        List<User> users = userMapper.selectByExample(example);
        System.out.println(users);
    }
    @Test
    //声明修改多个参数的值
    public void updateUserByCondition(){
        //根据Example中给出的条件，找到合适的，修改为User
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAddressBetween("11","22");
        User user = new User();
        user.setAddress("222222222222");
        userMapper.updateByExampleSelective(user,example);
    }
    @Test
    //声明多个参数的删除
    public void deleteUserByCondition(){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAddressEqualTo("111111111");
        userMapper.deleteByExample(example);
    }


}
