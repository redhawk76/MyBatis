package xyz.redhawk.generator.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.redhawk.generator.pojo.cr_area_mid;
import xyz.redhawk.generator.pojo.cr_area_midExample;

import java.util.List;

public interface cr_area_midMapper {
    int countByExample(cr_area_midExample example);

    int deleteByExample(cr_area_midExample example);

    int deleteByPrimaryKey(Long id);

    int insert(cr_area_mid record);

    int insertSelective(cr_area_mid record);

    List<cr_area_mid> selectByExample(cr_area_midExample example);

    cr_area_mid selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") cr_area_mid record, @Param("example") cr_area_midExample example);

    int updateByExample(@Param("record") cr_area_mid record, @Param("example") cr_area_midExample example);

    int updateByPrimaryKeySelective(cr_area_mid record);

    int updateByPrimaryKey(cr_area_mid record);
}