package cn.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("userlog")
public class Userlog implements Serializable {
	private static final long serialVersionUID = -6315675946883265486L;
	private Integer id;
	private String user;
	private String logindate;
	private String logoutdate;
	private String ip;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getLogindate() {
		return logindate;
	}
	public void setLogindate(String logindate) {
		this.logindate = logindate;
	}
	public String getLogoutdate() {
		return logoutdate;
	}
	public void setLogoutdate(String logoutdate) {
		this.logoutdate = logoutdate;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "Userlog [id=" + id + ", user=" + user + ", logindate=" + logindate + ", logoutdate=" + logoutdate
				+ ", ip=" + ip + "]";
	}
	
}
