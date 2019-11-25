package xyz.redhawk.mybatis.objects.entitys;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @param ${tags}
 * @author ${USER} , 大红鹰 (RedEagles)
 * @description: TODO
 * @return ${return_type}
 * @throws
 * @date 2019/5/19 20:23
 */
@Data
public class User implements Serializable {

    //表id
    private Integer id;

    //员工姓名
    private byte userName;

    //性别
    private char sex;

    //工号
    private int empId;

    //入职时间
    private LocalDateTime entryTime;

    //住址
    private String address;

    //生日
    private Date birthday;

    //工资
    private float salary;

    //年薪
    private BigDecimal annualSalary;

    //是否离职
    private boolean dimission;

    //员工角色
    private Set role;

    //离职日期
    private Calendar calendar;



}
