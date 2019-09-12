package com.cn.ctsi.domain;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8239721087618124192L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	private Long addressId;
	private Integer age;
	private String email;
	private String name;
	private String sex;
	
	protected User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long userId, Long addressId, Integer age, String email, String name, String sex) {
		super();
		this.userId = userId;
		this.addressId = addressId;
		this.age = age;
		this.email = email;
		this.name = name;
		this.sex = sex;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", addressId=" + addressId + ", age=" + age + ", email=" + email + ", name="
				+ name + ", sex=" + sex + "]";
	}
	
}
