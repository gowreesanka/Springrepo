package com.sathya.Spring;

public class Student {
	private EmailService emailService;
	private JavaCourseService javaCourseService;
	public EmailService getEmailService() {
		return emailService;
	}
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	public JavaCourseService getJavaCourseService() {
		return javaCourseService;
	}
	public void setJavaCourseService(JavaCourseService javaCourseService) {
		this.javaCourseService = javaCourseService;
	}
	
	
	
	public void details() {
		emailService.message();
		javaCourseService.courseInfo();
	}

}
