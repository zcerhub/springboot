package com.cn.ctsi.controller;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserVO {

	private String name;
	private Integer age;
	
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserVO(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + "]";
	}
	
}
