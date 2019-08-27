package vc.helloworld.mybatis.domain;



//封装登录的信息
 /**
 @description: TODO
 @param ${tags}
 @return ${return_type}
 @throws
 @author ${USER} , 大红鹰 (RedEagles)
 @date 2019/5/19 20:44
 */
public class LoginVO {
	private String username;
	private String password;

	 public String getUsername() {
		 return username;
	 }

	 public void setUsername(String username) {
		 this.username = username;
	 }

	 public String getPassword() {
		 return password;
	 }

	 public void setPassword(String password) {
		 this.password = password;
	 }

	 public LoginVO(String username, String password) {
		 this.username = username;
		 this.password = password;
	 }
 }
