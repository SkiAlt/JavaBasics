/*
Aim: Exception handling in java, introduction to throwable class, throw, throws, finally.
Program: Write a Java program to read two integers a and b. Compute a/b and print, when b
is not zero. Raise an exception when b is equal to zero.
*/
class ExceptionDemo {
	static void divide() {
		try {
			int a = 5, b = 0;
			int res = a / b;
			System.out.printf("%d", res);
		} catch (ArithmeticException e) {
			System.out.println("caught exception: " + e);
		} finally {
			System.out.println("lmao cat");
		}
	}

	public static void main(String args[]) {
		divide();
		System.out.println("Program finished.");
	}
}
