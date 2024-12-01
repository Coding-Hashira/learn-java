package loops_and_conditionals;

public class Loops {
    public static void main(String[] args) {
//      For loops_and_conditionals.Loops
        /*
         Syntax of for loops:

         for (initialization; condition; increment/decrement){
           // body
         }
        */

//      Q. Print numbers from 1 to 5
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

//      Q. Print numbers from n to 1
//        Scanner input = new Scanner(System.in);
//
//        int num = input.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            System.out.print(i + " ");
//        }

//      While loops_and_conditionals.Loops
        /*
        Syntax:
        while (condition) {
            // body
        }
        */

//        int num = 1;
//
//        while (num <= 5){
//            System.out.println(num);
//            num++;
//        }

//        # Use while loops when you don't know how many times the loop will run (eg: print x until user presses esc)
//          Use for loops when you know how many times the loop will run (eg: print first 10 prime numbers)

//        do while loops
        /*
            Syntax:

            do {
                // body
            } while (condition);

        */

        int n = 1;

        do {
            System.out.println(n);
            n++;
        } while (n <= 5);

//      # While loop vs Do While loop: The later run at least once
    }
}
