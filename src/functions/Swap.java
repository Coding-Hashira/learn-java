package functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + " " + b);

//        swapping a & b
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a,b); // won't work

        System.out.println(a + " " + b);
    }

    static void swap(int a, int b){
//        swapping a & b
        int temp = a;
        a = b;
        b = temp;
    }
}
