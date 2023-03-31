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
