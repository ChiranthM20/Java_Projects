package java_programs.STRINGS;

public class Comparision {
    public static void main(String[] args){

        //Same values one object
        String a = "Chiranth";
        String b = "Chiranth";
        System.out.println("a==b --> "+(a==b));  //here values are same and the reference variables are
                                                 // pointing to same object so output will be true


        //Same value different objects
        String c = new String("Chiranth");
        String d = new String("Chiranth");
        System.out.println("c==d --> "+(c==d));  //here values are same but 2 different objects and the reference
                                                 //variables are pointing to different objects hence output will be false


        //to just compare the value use (.equal) method
        String e = new String("Chiranth");
        String f = new String("Chiranth");
        System.out.println(e.equals(f));
    }
}
