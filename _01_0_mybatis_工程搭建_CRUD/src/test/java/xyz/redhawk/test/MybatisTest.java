package xyz.redhawk.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import xyz.redhawk.mybatis.mapper.UserMapper;
import xyz.redhawk.mybatis.objects.entitys.User;

import java.io.InputStream;


/**
 * @param ${tags}
 * @author ${USER} , 大红鹰 (RedEagles)
 * @description: TODO
 * @return ${return_type}
 * @throws
 * @date 2019/5/19 20:23
 */
public class MybatisTest {

    private InputStream in;
    private UserMapper userMapper;
    private SqlSession session;
    @Before//用于在测试方法执行之前执行
    public void init() throws Exception {
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.使用工厂对象，创建dao对象
        session = factory.openSession();
        userMapper = session.getMapper(UserMapper.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy() throws Exception {
        //6.释放资源
        in.close();
    }

    @Test
    public void retriveOneById() {
        userMapper.selectByPrimaryKey(1);
    }

    @Test
    public void insertOneUser() {
        User user = new User();
        userMapper.insert(user);
        session.commit();
    }

    @Test
    public void updateUser() {
        User user = userMapper.selectByPrimaryKey(1);
        user.setAddress("2222222");
        userMapper.updateByPrimaryKeySelective(user);
        session.commit();
    }

    @Test
    public void deleteUserById() {
        userMapper.deleteByPrimaryKey(4);
        session.commit();
    }
}
