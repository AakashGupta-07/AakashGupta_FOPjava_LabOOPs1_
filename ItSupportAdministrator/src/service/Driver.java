package service;

import java.util.Scanner;

import model.Employee;

public class Driver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first name :");
		String firstName = sc.nextLine();

		System.out.println("Enter last Name :");
		String lastName = sc.nextLine();
		
		Employee employee = new Employee( firstName , lastName);
		
		System.out.println("please enter any of the following options");
		
		System.out.println("1.Technical");
		
		System.out.println("2.Admin");
		
		System.out.println("3.Human Resource");
		
		System.out.println("4.Legal");
		
		Scanner sc1 = new Scanner(System.in);
		
		int option = sc1.nextInt();
		
		CredentialService cs = new CredentialService();
		
	    String generatedEmail;
	    char[] generatedPassword;
		
		if(option == 1 ) {
			
			generatedEmail = cs.generateEmailAddress( employee.getfirstName().toLowerCase() , employee.getlastName().toLowerCase()
					,"tech");
			
			generatedPassword = cs.generatePassword();
			
			cs.showCredentials(employee , generatedEmail , generatedPassword);
			
		}else if (option == 2 ) {
			
			generatedEmail = cs.generateEmailAddress( employee.getfirstName().toLowerCase() , employee.getlastName().toLowerCase()
					,"admin");
			
			generatedPassword = cs.generatePassword();
			
			cs.showCredentials(employee , generatedEmail , generatedPassword);
			
			
		}else if (option == 3) {
			
			generatedEmail = cs.generateEmailAddress( employee.getfirstName().toLowerCase() , employee.getlastName().toLowerCase()
					,"hr");
			
			generatedPassword = cs.generatePassword();
			
			cs.showCredentials(employee , generatedEmail , generatedPassword);
			
				
		
	} else if (option == 4 ) {
		
		generatedEmail = cs.generateEmailAddress( employee.getfirstName().toLowerCase() , employee.getlastName().toLowerCase()
				,"legal");
		
		generatedPassword = cs.generatePassword();
		
		cs.showCredentials(employee , generatedEmail , generatedPassword);
		

}    else {
	
	System.out.println("Enter valid option");
	
}
		
}
}
