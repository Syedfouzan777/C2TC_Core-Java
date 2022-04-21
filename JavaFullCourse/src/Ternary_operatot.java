
public class Ternary_operatot {

	public static void main(String[] args) {
		int a=10, b=20, c=50;
		int r = (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(r);
	}

}
