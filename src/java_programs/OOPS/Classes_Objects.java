package java_programs.OOPS;

public class Classes_Objects {
    public static void main(String[] args){

        Students Student1 = new Students();
        Student1.marks = 100;
        Student1.name = "Chiranth";
        Student1.age = 20;

        Students Student2 = new Students();
        Student2.marks = 90;
        Student2.name = "Chiru";
        Student2.age = 21;

        System.out.println("Student1 --> name : " + Student1.name + ", age : " + Student1.age);
        System.out.println("Student2 --> name : " + Student2.name + ", age : " + Student2.age);
    }


}
class Students {
    int marks;
    String name;
    int age;
}

