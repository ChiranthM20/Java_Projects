package java_programs.OOPS;

public class Constructors {
    public static void main(String[] args){

        Employee employee1 = new Employee("Chiranth",113,40000);
        Employee employee2 = new Employee("Chiru",99,50000);

        System.out.println(employee1.name);
        System.out.println(employee2.name);

        employee1.changeName("Chiru!!");

        employee1.greeting();

    }
}
class Employee{
    String name;
    int id;
    int salary;

    void greeting(){
        System.out.println("Hello! My name is "+name);
    }

    void changeName(String name){
        this.name = name;
    }

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        System.out.println("Name : "+name+ ", ID : "+id+ ", Salary : "+salary);
    }
}
