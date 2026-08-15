package java_programs.OOPS.ClassesAndObjects;

public class main {
    public static void main(String[] args) {
//        int[] rollno = {1,2,3,4,5};
//        String[] name = {"Chiranth","Alice","Bob","Carl","David" };
//        int[] marks = {20,21,22,2,22};
//        System.out.println(Arrays.toString(rollno));
//
//        System.out.println(Arrays.toString(marks));
//
//        // Code without class
//        System.out.println();

        Student chiranth = new Student();
        System.out.println(chiranth.marks);



    }
}
class Student {
    int rollno;
    String name;
    float marks;
}


