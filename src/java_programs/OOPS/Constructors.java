package java_programs.OOPS;

public class Constructors {
    public static void main(String[] args){

        Employee employee1 = new Employee("Chiranth",113,40000);
        Employee employee2 = new Employee("Chiru",99,50000);

        System.out.println(employee1.name);
        System.out.println(employee2.name);

        employee1.changeName("Chiru!!");

        employee1.greeting();

        Employee employee3 = new Employee();
        System.out.println(employee3.name+" "+employee3.id+" "+employee3.salary);


        Employee employee4 = employee2;
        employee2.salary = 100000;
        employee4.changeName("Human");
        System.out.println(employee4.name+" "+employee4.id+" "+employee4.salary);
    }
}
class Employee{
    String name;
    int id;
    int salary;

    Employee(){
        name = "unknown";
        id = 0;
        salary = 0;
    }

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
