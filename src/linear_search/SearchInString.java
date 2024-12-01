package linear_search;

public class SearchInString {
    public static void main(String[] args) {
        String name = "jassy";
        char target = 'a';

        System.out.println(search2(name, target));
    }

    static boolean search2(String str, char target){
        if (str.isEmpty()){
            return false;
        }


        for (char letter: str.toCharArray()){
            if (letter == target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target){
        if (str.isEmpty()){
            return false;
        }


        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
