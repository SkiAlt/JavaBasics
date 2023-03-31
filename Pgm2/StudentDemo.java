/*
2. Create a Java class called Student with the following details as variables within it.
USN, Name, Branch, Phone.
Write a Java program to create n Student objects and print the USN, Name, Branch, and Phone
of these objects with suitable headings.
*/
import java.util.Scanner;
class Student {
	String USN;
	String Name;
	String Branch;
	long Phone;
	//constructor
	Student(String usn, String name, String branch, long phone) {
		USN = usn;
		Name = name;
		Branch = branch;
		Phone = phone;
	}
}
class StudentDemo {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of students?:  ");
		int n = sc.nextInt();
		Student s[] = new Student[n]; //creating student array with n references
		//input block
		for(int i = 0; i < n; i++) {
			System.out.println("Enter details of " + (i+1) + " Student:");
			System.out.println("USN, Name, Branch, Phone:");
			String usn = sc.next();
			String name = sc.next();
			String branch = sc.next();
			long phone = sc.nextLong();
			//creating a new object for each reference in the array
			s[i] = new Student(usn, name, branch, phone); 
		}
		//output block
		System.out.println("\n\n\tStudent Details:\n----------------------------\n");
		System.out.printf("%15s%15s%15s%15s\n\n", "USN", "NAME", "BRANCH" ,"PHONE");
		for(int i = 0; i < n; i++)
			System.out.printf("%15s%15s%15s%15d\n", s[i].USN, s[i].Name, s[i].Branch, s[i].Phone);
	}
}
