package com.mphasis.EmployeePayroll;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertNotNull;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mphasis.EmployeePayroll.Repositories.EmployeeRepository;
import com.mphasis.EmployeePayroll.models.Employee;
@SpringBootTest
public class EmployeeTest {
	@Autowired
	EmployeeRepository emprepo;
  @Test
  public void testCreate(){
	  Employee e = new Employee();
	  e.setEid(2L);
	  e.setEmail("vars@123");
	  e.setGender("male");
	  e.setName("varshan");
	  e.setPasswd("v@123");
	  e.setPhone("555555");
	  e.setDesignation("SE");
	  e.setDOB("2015-12-06");
	  e.setAddress("dpi");
	  
	  emprepo.save(e);
	  assertNotNull(emprepo.findById(2L).get());
}}