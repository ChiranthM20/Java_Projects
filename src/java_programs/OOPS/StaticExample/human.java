package java_programs.OOPS.StaticExample;

public class human {
    int id;
    String name;
    int salary;
    static int population;

    human(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        human.population += 1;
    }
    void display(){
        System.out.println("Hello "+name+"! Your id is "+id+" and your salary is "+salary);
    }

}
