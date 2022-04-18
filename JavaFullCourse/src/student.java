
public class student {
	int id;
	String name;
	student(int i, String n){
		id = i;
		name = n;
	}
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		student s1  = new student(1,"kiran");
		student s2  = new student(2,"Mohan");
		s1.display();
		s2.display();
	}

}
