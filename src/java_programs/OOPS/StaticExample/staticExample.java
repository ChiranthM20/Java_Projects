package java_programs.OOPS.StaticExample;

public class staticExample {
    public static void main(String[] args) {
        Student student1 = new Student(13, "Chiranth");
        Student student2 = new Student(04, "Adithya");
        Student student3 = new Student(07, "Antony Kevin");
        Student student4 = new Student(70, "Srujan");

        student1.display();
        student2.display();
        student3.display();
        student4.display();

        // Year and college name is same for everyone because they are from same college and same year
    }
}
class Student {
    int rollno;
    String name;
    static int year;
    static String college;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        Student.year = 4;
        Student.college = "Garden City University";
    }

    void display(){
        System.out.println("Name : "+name+", Rollno : "+rollno+", Year : "+year+", College : "+college);
    }
}
