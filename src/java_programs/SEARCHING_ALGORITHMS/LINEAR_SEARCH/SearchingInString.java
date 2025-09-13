package java_programs.SEARCHING_ALGORITHMS.LINEAR_SEARCH;

public class SearchingInString {
    public static void main(String[] args) {
        String str = "Chiranth";
        char target = 'r';
        System.out.println(searchInString(str, target));


    }

    static boolean searchInString(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}