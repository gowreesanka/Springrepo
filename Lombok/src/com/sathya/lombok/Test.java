package com.sathya.lombok;

public class Test {

	public static void main(String[] args) {
		
		//constructor injeting the values
		Employee employee=new Employee(111, "sankar", 111.0);
		System.out.println(employee);
		
		//setters are injeting the value
		Employee employee2=new Employee();
		employee2.setEmpId(104);
		employee2.setEmpName("Ram");
		employee2.setEmpSalary(1111.0);
		System.out.println(employee2.getEmpId()+"  "+employee2.getEmpName()+"  "+employee2.getEmpSalary());
		
		//Using @build Annotation
		Employee employee3=Employee.builder().empId(111).empName("sitha").empSalary(123).build();
		
		System.out.println(employee3);
	}

}
