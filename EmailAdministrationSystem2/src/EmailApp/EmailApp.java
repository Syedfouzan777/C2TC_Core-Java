package EmailApp;

import java.util.Scanner;

public class EmailApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// User info
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		System.out.println("Enter Last Name: ");
		String lname = sc.next();

		// creating object for email class
		Email e = new Email(fname, lname);
		int choice = -1;
		do {
			System.out.println(
					"\n*****\nEnter your choice\n1.Show Info\n2.Change Password\n3.Change mailbox capacity\n4.Set Alternate mail\n5. Store data in file\n6.Display data from file\n.7 Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				e.getInfo();
				break;
			case 2:
				e.setPassword();
				break;
			case 3:
				e.setMailCap();
				break;
			case 4:
				e.alternateEmail();
				break;
			case 5:
				e.storefile();
				break;
			case 6:
				e.read_file();
				break;
			case 7:
				System.out.println("Thank You for using application!");
				break;
			default:
				System.out.println("Invalid choice.\nEnter proper choice again..");
			}
		} while (choice != 8);

	}
}
