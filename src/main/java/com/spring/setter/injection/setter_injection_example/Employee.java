package com.spring.setter.injection.setter_injection_example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private Address address;
	List<String> qualifications = new ArrayList<>();
	Set<Integer> ids = new HashSet<>();
	Map<Integer, String> dept = new HashMap<>();
	public Map<Integer, String> getDept() {
		return dept;
	}
	public void setDept(Map<Integer, String> dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public Set<Integer> getIds() {
		return ids;
	}
	public void setIds(Set<Integer> ids) {
		this.ids = ids;
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
	
	public List<String> getQualifications() {
		return qualifications;
	}
	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", qualifications=" + qualifications
				+ ", ids=" + ids + ", dept=" + dept + "]";
	}
	
	
	
	
	
	

}
