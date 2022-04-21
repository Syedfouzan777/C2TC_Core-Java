import java.util.Scanner;

public class while_loop {

	public static void main(String[] args) {
			int num;
			System.out.println("Enter any number: ");
			Scanner a=new Scanner(System.in);
			num = a.nextInt();
			while(num>=0) {
				if(num%2==0) {
					System.out.println("Even number");
				}
				else {
					System.out.println("odd number");

				}
			}
	}

}

