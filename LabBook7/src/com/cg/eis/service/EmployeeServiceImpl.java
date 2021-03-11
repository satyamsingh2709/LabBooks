package com.cg.eis.service;


import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeDetails;

public class EmployeeServiceImpl extends Employee implements EmployeeService{
	
	String insuranceScheme;
	public void getDetailsFromUser() {
		System.out.println("Enter the emp id");
		Scanner sc=new Scanner(System.in);
		int empid=sc.nextInt();
		System.out.println("Enter the emp salary:");
		int empsalary=sc.nextInt();
		System.out.println("Enter the emp designation of employee:");
		String empDesignation=sc.next();
		
		Employee emp=new Employee();
		emp.setId(empid);
		emp.setSalary(empsalary);
		emp.setDesination(empDesignation);
		int esalary=emp.getSalary();
		String edesignation=emp.getDesination();
		String einsurance=insuranceScheme(esalary,edesignation);
		emp.setInsuranceScheme(einsurance);
		System.out.println(emp.getId());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDesination());
		System.out.println(emp.getInsuranceScheme());
}
	public String insuranceScheme(int empsalary,String empDesignation) {
		if((empsalary>5000&&empsalary<20000)&&(empDesignation.equals("System Associate"))) {
			insuranceScheme="Scheme C";
		}else if((empsalary>=20000&&empsalary<40000)&&(empDesignation.equals("Programmer"))) {
			insuranceScheme="Scheme B";
		}else if((empsalary>=40000)&&(empDesignation.equals("Manager"))){
			insuranceScheme="Scheme A";
		}else if((empsalary<5000)&&(empDesignation.equals("Clerk"))) {
			insuranceScheme="None";
		}
		return insuranceScheme;
	
	}

}
