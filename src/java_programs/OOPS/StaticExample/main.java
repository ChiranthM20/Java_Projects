package java_programs.OOPS.StaticExample;

public class main {
    public static void main(String[] args) {
        human Chiranth = new human(13,"Chiranth",40000);
        // Chiranth.display();
        human Alice = new human(13,"Alice",40000);
        // Alice.display();
        human Bob = new human(13,"Bob",40000);
        human Carl = new human(13,"Carl",40000);

        System.out.println(Chiranth.population);
        System.out.println(Alice.population);
        System.out.println(Bob.population);
        System.out.println(Carl.population);

        // Population for every human will be same
        // if i create 4 humans then the population will be 4

    }
}
