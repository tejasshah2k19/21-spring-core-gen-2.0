package com.bean;

//new 
//spring-> 
public class UserBean {

	String firstName;
	String email;
	String password;

	public void init() {
		System.out.println("init - userBean");
	}

	public void destroy() {
		System.out.println("destroy - userBean");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
