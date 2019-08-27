package vc.helloworld.mybatis.mapper;


import org.apache.ibatis.annotations.Param;
import vc.helloworld.mybatis.domain.Client;
import vc.helloworld.mybatis.domain.LoginVO;

import java.util.List;
import java.util.Map;

/**
@description: TODO
@param ${tags}
@return ${return_type}
@throws
@author ${USER} , 大红鹰 (RedHawk)
@date 2019/5/19 20:44
*/
public interface ClientMapper {

	//方式一:把多个参数封装成JavaBean
	Client login1(LoginVO vo);

	//方式二:使用Map对象来封装多个参数
	Client login2(Map<String, Object> paramMap);

	//方式三:使用Param注解,原理是方式二,Param注解中的字符串表示在Map中的key
	Client login3(@Param("username") String userxiaofan, @Param("password") String passwordxiaofan);
	
	List<Client> list(@Param("orderBy") String orderBy);
}
