package xyz.redhawk.mybatis.objects.entitys;/**
 * @author RedHawk
 * @create 2019-11-25 15:43
 */

import java.util.ArrayList;
import java.util.List;

/**
 * <Description> <br>
 *
 * @author redhawk<br>
 * @taskId:   <br>
 * @version 1.0<br>
 * @createDate 2019/11/25 15:43 <br>
 * @see xyz.redhawk.mybatis.objects.entitys <br>
 */
public class Department {

    private Long id;
    private String name;
    //一个部门关联多个员工
    private List<User> emps = new ArrayList<User>();
}
