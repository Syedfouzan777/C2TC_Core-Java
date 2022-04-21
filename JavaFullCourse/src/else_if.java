import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
				int b;
				System.out.println("Enter Your age: ");
				Scanner s=new Scanner(System.in);
				b=s.nextInt();
				if(b>=18 && b<65) {
					System.out.println("You can drive");
				}else if(b<18 ) {
					System.out.println("You are not eliglible");
				}else {
					System.out.println("You can't drive");
				}
				
	}

}
