package com.jui.bookLion.dto;

public class UserDTO {

	private int no;
	private String id;
	private String password;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String birth;
	private String account;

	public UserDTO(int no, String id, String password, String name, String address, String phone, String email,
			String birth, String account) {
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.birth = birth;
		this.account = account;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "UserDTO [no=" + no + ", id=" + id + ", password=" + password + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + ", birth=" + birth + ", account=" + account + "]";
	}

}
