package xyz.redhawk.mybatis.mapper;
/*
    @build SuipriseWang
    @Time 2019/11/28
 */


import xyz.redhawk.mybatis.objects.entitys.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}