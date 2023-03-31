// 5. Demonstrate Method overloading
class MethodOverloading {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	float add(float a, float b) {
		return a + b;
	}

	public static void main(String args[]) {
		MethodOverloading obj = new MethodOverloading();
		int s1 = obj.add(10, 20);
		int s2 = obj.add(10, 20, 30);
		float s3 = obj.add(2.2f, 2.2f);
		System.out.println("Method Overload Sum1=" + s1);
		System.out.println("Method Overload Sum2=" + s2);
		System.out.println("Method Overload Sum3=" + s3);
	}
}
