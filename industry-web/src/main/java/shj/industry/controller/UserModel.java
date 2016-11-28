package shj.industry.controller;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class UserModel implements Serializable {
	private String username;
	private String name;
	private String mobile;
	
	public UserModel() {
	}
	public UserModel(String username, String name, String mobile) {
		this.username = username;
		this.name = name;
		this.mobile = mobile;
	}
	@JsonProperty(value="um")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@JsonProperty(value="n")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@JsonProperty(value="m")
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
