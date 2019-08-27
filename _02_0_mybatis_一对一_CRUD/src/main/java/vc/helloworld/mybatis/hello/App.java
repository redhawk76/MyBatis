package vc.helloworld.mybatis.hello;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import vc.helloworld.mybatis.domain.Department;
import vc.helloworld.mybatis.mapper.DepartmentMapper;
import vc.helloworld.mybatis.util.MyBatisUtil;

public class App {


    //查询10号部门的信息和包含的员工信息
    @Test
    public void testGet() throws Exception {
        SqlSession session = MyBatisUtil.getSession();
        DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
        Department d = departmentMapper.get(1L);

    //  System.out.println(d.getClass());
        System.out.println(d.getEmps());
    }
}
