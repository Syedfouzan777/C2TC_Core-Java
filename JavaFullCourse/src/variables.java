class variables {
	
	int a = 10; //Instance Variable
	static double b = 25.55; //Static variable
	public static void main(String[] args) {
		
		int c = 1; //Local varible
		variables v=new variables();
		System.out.println(v.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(v.a+" "+b+" "+c);

	}

}
