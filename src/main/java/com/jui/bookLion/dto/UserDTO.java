package com.jui.bookLion.dto;

public class UserDTO {

	private int no;
	private String name;
	private String id;
	private String password;
	private String phone;
	private String email;

	public UserDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDTO(int no, String name, String id, String password, String phone, String email) {
		this.no = no;
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO [no=" + no + ", name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone
				+ ", email=" + email + "]";
	}

}
