
public class methods {

	public static void main(String[] args) {
		int r = sum(10,20);
		System.out.println("Addition "+r);
		methods m=new methods();
		m.add();
	}
	static int sum(int a, int b)
	{
		return a+b;
	}
	void add() {
		System.out.println("Good morning");
	}

}
