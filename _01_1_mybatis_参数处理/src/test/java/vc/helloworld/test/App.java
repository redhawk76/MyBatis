package vc.helloworld.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import vc.helloworld.mybatis.domain.Client;
import vc.helloworld.mybatis.domain.LoginVO;
import vc.helloworld.mybatis.mapper.ClientMapper;
import vc.helloworld.mybatis.util.MyBatisUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

	@Test
	public void  testLogin1() throws Exception {
		LoginVO vo = new LoginVO("xiaofan", "123456");
		SqlSession session = MyBatisUtil.getSession();
		ClientMapper clientMapper = session.getMapper(ClientMapper.class);
		Client client = clientMapper.login1(vo);
		session.close();
		System.out.println(client);
	}

	@Test
	public void  testLogin2() throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>() {
			{
				this.put("username", "xiaofan");
				this.put("password", "123456");
			}
		};
		SqlSession session = MyBatisUtil.getSession();
		ClientMapper clientMapper = session.getMapper(ClientMapper.class);
		Client client = clientMapper.login2(paramMap);
		session.close();
		System.out.println(client);
	}
	@Test
	public void  testLogin3() throws Exception {
		SqlSession session = MyBatisUtil.getSession();
		ClientMapper clientMapper = session.getMapper(ClientMapper.class);
		Client client = clientMapper.login3("xiaofan","123456");
		session.close();
		System.out.println(client);
	}
	@Test
	public void  test4() throws Exception {
		SqlSession session = MyBatisUtil.getSession();
		ClientMapper clientMapper = session.getMapper(ClientMapper.class);
		List<Client> list = clientMapper.list("id desc");
		session.close();
		for (Client c : list) {
			System.out.println(c);
		}
	}
}
