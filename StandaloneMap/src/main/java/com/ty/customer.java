package com.ty;

import java.util.List;
import java.util.Map;

public class customer {
	
	private int id;
	private String name;
	private int age;
	
	private List <String>banks;
	private Map <Long ,String>phnoloc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getBanks() {
		return banks;
	}
	public void setBanks(List<String> banks) {
		this.banks = banks;
	}
	public Map<Long, String> getPhnoloc() {
		return phnoloc;
	}
	public void setPhnoloc(Map<Long, String> phnoloc) {
		this.phnoloc = phnoloc;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", age=" + age + ", banks=" + banks + ", phnoloc=" + phnoloc
				+ "]";
	}
	

}
