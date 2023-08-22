package com.example.demo.model;


//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emptable")
public class Employee {
@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	 private String employeeName;
//@Column(name="age")	 
private int employeeage;
private long salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String employeeName, int employeeage, long salary) {
	super();
	this.id = id;
	this.employeeName = employeeName;
	this.employeeage = employeeage;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getEmployeeage() {
	return employeeage;
}
public void setEmployeeage(int employeeage) {
	this.employeeage = employeeage;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}


}
