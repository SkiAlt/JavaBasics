class ConstructorOverloading {
	int id;
	String name;

	ConstructorOverloading() { // defualt constructor
		System.out.println("\nDefault Constructor values: \n");
		System.out.println("Student Id : " + id + "\nStudent Name : " + name);
	}

	ConstructorOverloading(int i, String n) { // parameterized constructor
		id = i;
		name = n;
		System.out.println("\nParameterized Constructor values: \n");
		System.out.println("Student Id : " + id + "\nStudent Name : " + name);
	}

	public static void main(String[] args) {
		ConstructorOverloading ob1 = new ConstructorOverloading();
		ConstructorOverloading ob2 = new ConstructorOverloading(69, "Meow");
	}
}
