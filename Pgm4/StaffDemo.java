/*
Aim: Demonstrate the core object-oriented concept of Inheritance, polymorphism.
Program: Design a super class called Staff with details as StaffId, Name, Phone, Salary. Extend this class
by writing three subclasses namely Teaching (domain, publications), Technical (skills), and
Contract (period). Write a Java program to read and display at least 3 staff objects of all three
categories.
*/
import java.util.Scanner;
class Staff {
        int StaffId;
        String Name;
        String Phone;
        long Salary;

        Staff(int staffId, String name, String phone, long salary) {
                StaffId = staffId;
                Name = name;
                Phone = phone;
                Salary = salary;
        }

        public void Display() {
                System.out.format("%10s%20s%12s%15s", StaffId, Name, Phone, Salary);
        }
}

class Teaching extends Staff {
        private String Domain;
        private int Publications;

        public Teaching(int staffId, String name, String phone,
                        long salary, String domain, int publications) {
                super(staffId, name, phone, salary);
                Domain = domain;
                Publications = publications;
        }

        public void Display() { // method overriding
                super.Display();
                System.out.format("%10s%15s%10s%10s", Domain, Publications, "--", "--");
        }
}

class Technical extends Staff {
        private String Skills;

        public Technical(int staffId, String name, String phone,
                        long salary, String skills) {
                super(staffId, name, phone, salary);
                Skills = skills;
        }

        public void Display() {
                super.Display();
                System.out.format("%10s%15s%10s%10s", "--", "--", Skills, "--");
        }
}

class Contract extends Staff {
        private int Period;

        public Contract(int staffId, String name, String phone, long salary, int period) {
                super(staffId, name, phone, salary);
                this.Period = period;
        }

        public void Display() {
                super.Display();
                System.out.format("%10s%15s%10s%10s", "--", "--", "--", Period);
        }
}

class StaffDemo {
        public static void main(String[] args) {
                int StaffId;
                String Name, Phone;
                long Salary;
                String Domain;
                int Publications;
                String Skills;
                int Period;
                Scanner sc = new Scanner(System.in);
                Staff staff[] = new Staff[50];
                System.out.println("Enter number of Teaching Staff : ");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                        System.out.println("Enter Teaching Staff details:" + i);
                        System.out.println("staff id");
                        StaffId = sc.nextInt();
                        System.out.println("name");
                        Name = sc.next();
                        System.out.println("phone");
                        Phone = sc.next();
                        System.out.println("salary");
                        Salary = sc.nextLong();
                        System.out.println("Domain");
                        Domain = sc.next();
                        System.out.println("publications");
                        Publications = sc.nextInt();
                        staff[i] = new Teaching(StaffId, Name, Phone,
                                        Salary, Domain, Publications);
                }
                System.out.println("Enter number of Technical Staff : ");
                int m = sc.nextInt();
                for (int i = n + 1; i <= m + n; i++) {
                        System.out.println("Enter Technical Staff details :" + i);
                        System.out.println("staff id");
                        StaffId = sc.nextInt();
                        System.out.println("name");
                        Name = sc.next();
                        System.out.println("phone");
                        Phone = sc.next();
                        System.out.println("salary");
                        Salary = sc.nextLong();
                        System.out.println("skills");
                        Skills = sc.next();
                        staff[i] = new Technical(StaffId, Name, Phone, Salary, Skills);
                }
                System.out.println("Enter number of Contract Staff : ");
                int p = sc.nextInt();
                for (int i = n + m + 1; i <= m + n + p; i++) {
                        System.out.println("Enter Contract Staff details:" + i);
                        System.out.println("staff id");
                        StaffId = sc.nextInt();
                        System.out.println("name");
                        Name = sc.next();
                        System.out.println("phone");
                        Phone = sc.next();
                        System.out.println("salary");
                        Salary = sc.nextLong();
                        System.out.println("period");
                        Period = sc.nextInt();
                        staff[i] = new Contract(StaffId, Name, Phone, Salary, Period);
                }
                System.out.format("%10s%20s%12s%15s%10s%15s%10s%10s",
                                "Staff ID", "Name", "Phone", "Salary", "Domain",
                                "Publication", "Skills", "Period");
                System.out.println();
                for (int i = 1; i <= n + m + p; i++) {
                        staff[i].Display();
                        System.out.println();
                }
        }
}
