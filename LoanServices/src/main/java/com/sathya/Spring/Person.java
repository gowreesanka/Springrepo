package com.sathya.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private HomeLoanService homeLoanService;
	private RealStateService realStateService;
	@Autowired
	public Person(HomeLoanService homeLoanService, RealStateService realStateService) {
		super();
		this.homeLoanService = homeLoanService;
		this.realStateService = realStateService;
	}
	
	public void details() {
		
		homeLoanService.loanInfo();
		realStateService.realStateInfo();
	}

}
