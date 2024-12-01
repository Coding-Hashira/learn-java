package linear_search;

public class SearchInRange {
    public static void main(String[] args) {
        String name = "jashan";
        char target = 'j';
        int start = 0;
        int end = 4;

        System.out.println(search(name, target, start, end));
    }

    static boolean search(String str, char target, int start, int end){
        for (int i = start; i < end; i++) {
            if (str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
