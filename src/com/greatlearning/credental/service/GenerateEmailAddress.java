package com.greatlearning.credental.service;

public class GenerateEmailAddress {
GeneratePassword generatePassword = new GeneratePassword();

	public void generateEmailAddress(String firstName) {
		System.out.println();
		System.out.println("Dear" + firstName.toUpperCase() + "Your generated credentials are ");
		System.out.println();
		
	}
	
	public void technical(String firstName, String lastName) {
	    GernarateEmailAddress obj = new GernarateEmailAddress();
		obj.generateEmailAddress();
		System.out.println("Email : " + firstName.toLowerCase() + "@tech.greatlearning.com");
		System.out.println("Password :" + generatePassword.generatePassword());
	}
	
	
	public void admin(String firstName, String lastName) {
		GernarateEmailAddress obj = new GernarateEmailAddress();
		obj.generateEmailAddress();
		System.out.println("Email : " + firstName.toLowerCase() + "@admin.greatlearning.com");
		System.out.println("Password :" + generatePassword.generatePassword());
	}
	
	public void humanresource(String firstName, String lastName) {
		GernarateEmailAddress obj = new GernarateEmailAddress();
		obj.generateEmailAddress();
		System.out.println("Email : " + firstName.toLowerCase() + "@hr.greatlearning.com");
		System.out.println("Password :" + generatePassword.generatePassword());
	}
	
	public void legal(String firstName, String lastName) {
		GernarateEmailAddress obj = new GernarateEmailAddress();
		obj.generateEmailAddress();
		System.out.println("Email : " + firstName.toLowerCase() + "@legal.greatlearning.com");
		System.out.println("Password :" + generatePassword.generatePassword());
	}
	
	public void exit() {;
	System.out.println("Thank You");
    }

}

	
	}


