//A static method belongs to the class, while a non-static method belongs to an object.

package java_programs.OOPS.StaticExample;

public class staticExample {
    public static void main(String[] args) {
        Student student1 = new Student(13, "Chiranth");
        Student student2 = new Student(4, "Adithya");
        Student student3 = new Student(7, "Antony Kevin");
        Student student4 = new Student(70, "Srujan");

        student1.display();
        student2.display();
        student3.display();
        student4.display();

        System.out.println("");
        System.out.println("Hello "+student1.name+" there are "+ Student.population +" Students in your class");

        // Year and college name is same for everyone because they are from same college and same yeargit ststus

        fun();
    }
    static void fun(){
        // STATIC METHOD:
        // fun() belongs to the class, not to any particular object.
        // Therefore, fun() can be called without creating an object.

        // Since greeting() is NON-STATIC (belongs to an object),
        // we cannot directly call greeting() here like: greeting();

        // We must create an object first and use that object
        // to call the non-static greeting() method.

        staticExample obj = new staticExample();
        obj.greeting();

        System.out.println("hello");
    }

    void greeting(){
        System.out.println("Hello");

        // NON-STATIC METHOD:
        // greeting() belongs to an object of staticExample.
        // Therefore, we need an object to call greeting(),
        // for example: obj.greeting();
        //
        // A non-static method CAN directly call a static method
        // because the static method belongs to the class,
        // so no specific object is required.

    }
}
class Student {
    int rollno;
    String name;
    static int year;
    static String college;
    static int population;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        Student.year = 4;
        Student.college = "GARDEN CITY UNIVERSITY";
        Student.population +=1;
    }




    void display(){
        System.out.println("Name : "+name+", Rollno : "+rollno+", Year : "+year+", College : "+college);
    }
}
