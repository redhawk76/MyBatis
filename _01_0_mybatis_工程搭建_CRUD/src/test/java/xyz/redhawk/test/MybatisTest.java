package xyz.redhawk.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import xyz.redhawk.mybatis.mapper.UserMapper;

import java.io.InputStream;


/**
@description: TODO
@param ${tags} 
@return ${return_type} 
@throws
@author ${USER} , 大红鹰 (RedEagles)  
@date 2019/5/19 20:23
*/
public class MybatisTest {

    private InputStream in;
    private UserMapper userMapper;

    @Before//用于在测试方法执行之前执行
    public void init()throws Exception{
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3.使用工厂对象，创建dao对象
        SqlSession session = factory.openSession();
        userMapper = session.getMapper(UserMapper.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy()throws Exception{
        //6.释放资源
        in.close();
    }

    @Test
    public void selectAll(){
        try {
            userMapper.selectByPrimaryKey(1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
