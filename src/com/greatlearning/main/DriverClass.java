package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.credental.service.GenerateEmailAddress;
import com.greatlearning.model.Employee;

public class DriverClass {
	
	public static void main (String[] args) {
		
		Employee employee1 = new Employee();
		GenerateEmailAddress generateEmailAddress1 = new GenerateEmailAddress();
		
		Scanner sc = new Scanner (System.in);
		String firstName = null;
		String lastName;
		
		System.out.println("Welcome to the Great Learnings");
		System.out.println();
		
		System.out.println("Enter your first name");
		System.out.println();
		
		System.out.println("Enter your last name");
		System.out.println();
		
		lastName = sc.nextLine();
		
		employee1.setfirstName(firstName);
		employee1.setlastName(lastName);
		
		int option;
		
		do {
			
			System.out.println();
			System.out.println("Please enter the department");
			System.out.println("1. : Technical");
			System.out.println("2. : Admin");
			System.out.println("3. : Human Resource");
			System.out.println("4. : Legal");
			System.out.println("0. : Exit");
			
			option = sc.nextInt();
			
			switch (option) {
			
			case 0 :{
				generateEmailAddress.exit();
				
				break;
			}
			
			case 1 :{
				generateEmailAddress.technical();
			}
			
			break;
			
			
				
				case 2 :{
					generateEmailAddress.admin();
					
				}
				
				break;
				
				generateEmailAddress.humanResource();
				
			}
			
			break;
			
			generateEmailAddress.legal();
			
		
		
		break;
		
	
		
			System.out.println("Enter Valid Option");
			
			
		} 
		
		while (option != 0);
	}
	}
		
		
		
				
				
			
			
			
	
			
		
		
	

