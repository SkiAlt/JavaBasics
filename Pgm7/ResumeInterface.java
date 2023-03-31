/*
Aim: Introduction to abstract classes, abstract methods, and Interface in java.
Program: Write a program to generate the resume. Create 2 Java classes Teacher (data:
personal information, qualification, experience, achievements) and Student (data: personal
information, result, discipline) which implements the java interface Resume with the method
biodata().
*/

interface Resume{
    void biodata();
}

class Teacher implements Resume{
    String name, qualification, achivements;
    float experience;
    public void biodata(){
        name="Pretham";
        qualification="M.tech";
        achivements="Q1 publication";
        experience=14.8f;
        System.out.println("Teacher Resume");
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Achivements: " + achivements);
        System.out.println("Experience: " + experience);
    }
}

class Student implements Resume{
    
	public void biodata(){
        String name="Skia", discipline="Cosomology";
        float result= 9.5f;
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Discipline: " + discipline);
        System.out.println("Result: " + result+ " CGPA" );
    }
}

class ResumeInterface{
    public static void main(String[] args) {
        Student studentobject = new Student();
        Teacher teacherobject =new Teacher();
        studentobject.biodata();
        teacherobject.biodata();
    }    
}
