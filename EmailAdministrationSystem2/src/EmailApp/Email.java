package EmailApp;

import java.util.*;
import java.io.*;

public class Email {

	Scanner sc = new Scanner(System.in); // scanner class which is used to take input from the user

	// Setting Variables as Private Accessibility
	private String fname;
	private String lname;
	private String dept;
	private String email;
	private String password;
	private int mailCapacity;
	private String alter_email;

	// Constructor to receive first name ,last name
	public Email(String fname, String lname) {

		this.fname = fname;
		this.lname = lname;
		System.out.println("New Employee: " + this.fname + " " + this.lname);
		// calling method
		this.dept = this.setDept(); // Department
		this.password = this.generatePassword(8); // Password
		this.email = this.generateEmail(); // Email

	}

	// Generate Email method
	private String generateEmail() {
		return this.fname.toLowerCase() + "." + this.lname.toLowerCase() + "@" + this.dept.toLowerCase() + "gmail.com";
	}

	// Asking for department
	private String setDept() {
		System.out.println("Department codes \n1 for sales \n2 for Development \n3 for Accounting \0 for none ");
		boolean flag = false;
		do {
			System.out.println("Enter Department code");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				return "sales";
			case 2:
				return "Development";
			case 3:
				return "Accounting";
			case 0:
				return "None";
			default:
				System.out.println("Invalid Choice");

			}
		} while (!flag);
		return null;

	}

	// Generate Random Password
	private String generatePassword(int length) {
		Random r = new Random();
		String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%&?";
		String values = capitalChars + smallChars + numbers + symbols;
		String password = "";
		for (int i = 0; i < length; i++) {
			password = password + values.charAt(r.nextInt(values.length()));
		}
		return password;
	}
	// change password method

	public void setPassword() {

		boolean flag = false;
		do {
			System.out.println("Do you want to change your password!(Y/N)");
			char choice = sc.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				flag = true;
				System.out.println("Enter current  password");
				String temp = sc.next();
				if (temp.equals(this.password)) {
					System.out.println("Enter new Password: ");
					this.password = sc.next();
					System.out.println("Password changed successfully");
				} else {
					System.out.println("Incorrect password");
				}
			} else if (choice == 'N' || choice == 'n') {
				flag = true;
				System.out.println("Password chage option is cancelled!");
			} else {
				System.out.println("Enter valid choice");
			}
		} while (!flag);

	}

	// set mailbox capacity method
	public void setMailCap() {
		System.out.println("Current Capacity = " + this.mailCapacity + "mb");
		System.out.println("Enter new mail box capacity: ");
		this.mailCapacity = sc.nextInt();
		System.out.println("Mailbox capacity is successfully changed");
	}

	// set alternate email
	public void alternateEmail() {
		System.out.println("Enter new alternate mail: ");
		this.alter_email = sc.next();
		System.out.println("Alternate email is set");
	}

	// display user information method
	public void getInfo() {
		System.out.println("New:  " + this.fname + " " + this.lname);
		System.out.println("Department:  " + this.dept);
		System.out.println("Email:  " + this.email);
		System.out.println("Password:  " + this.password);
		System.out.println("Mailbox capacity:  " + this.mailCapacity + "mb");
		System.out.println("Alternate mail:  " + this.alter_email);

	}

	// Store in File
	public void storefile() {
		try {
			FileWriter in = new FileWriter("C:\\Users\\Admin\\Desktop\\info.txt");
			in.write("First name:" + this.fname);
			in.append("\nLast name:" + this.lname);
			in.append("\nEmail:" + this.email);
			in.append("\nPassword:" + this.password);
			in.append("\nCapacity:" + this.mailCapacity);
			in.append("\nAlternate mail:" + this.alter_email);
			in.close();
			System.out.println("Data Stored");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	// reading file method

	public void read_file() {
		
		
		try {
			FileReader f1=new FileReader("C:\\Users\\Admin\\Desktop\\info.txt");
			int i;
			while((i=f1.read())!=-1){
			}
			f1.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		}

}
