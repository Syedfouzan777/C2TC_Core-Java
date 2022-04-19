import java.util.Scanner;

public class Condition_if_else {

	public static void main(String[] args) {
		int pwd;
		System.out.println("Enter password: ");
		Scanner obj=new Scanner(System.in);
		pwd=obj.nextInt();
		if(pwd==7041)
		{
			System.out.println("You entered correct password here is the information");
			System.out.println("My name is Syed Fouzan");
			System.out.println("My age is 23");
		}
		else
		{
			System.out.println("Sorry Wrong Password");
		}
	}

}
