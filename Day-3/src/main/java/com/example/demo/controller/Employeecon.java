package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.Employeeser;

@RestController
public class Employeecon {
	@Autowired
  Employeeser ser;
	@PostMapping("add")
	public Employee adddata(@RequestBody Employee e) {
		return ser.saveinfo(e);
	}
	@GetMapping("print")
	public List<Employee> show(){
		return ser.show();
	}

}
