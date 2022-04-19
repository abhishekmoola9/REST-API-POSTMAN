package com.acs.restapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "dept")
	private String dept;
	
	@Column(name = "age")
	private int age;
	
	public Employee() {
		
	}
	public Employee(String employeeName, long id, String dept, int age) {
		super();
		this.employeeName = employeeName;
		this.id = id;
		this.dept = dept;
		this.age = age;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", id=" + id + ", dept=" + dept + ", age=" + age + "]";
	}

}
