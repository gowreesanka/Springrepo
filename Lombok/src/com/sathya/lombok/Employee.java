package com.sathya.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Builder
@Setter
@Getter
@NoArgsConstructor

@AllArgsConstructor
@ToString
public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;

}
