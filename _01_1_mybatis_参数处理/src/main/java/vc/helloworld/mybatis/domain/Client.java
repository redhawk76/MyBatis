package vc.helloworld.mybatis.domain;



/**
@description: TODO
@param ${tags}
@return ${return_type}
@throws
@author ${USER} , 大红鹰 (RedEagles)
@date 2019/5/19 20:43
*/
public class Client {
	private Long id;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	private String username;
	private String password;

	@Override
	public String toString() {
		return "Client{" +
				"id=" + id +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
