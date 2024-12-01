package switch_cases;

import java.util.Scanner;

/*
    While dealing with strings, == compares references, so,
    String a = new String("hello");
    String b = new String("hello");
    System.out.println(a == b); // This will print "false" because a and b are different objects.
    String a = new String("hello");
    String b = a;
    System.out.println(a == b); // This will print "true" because b is assigned the same reference as a.
    Whereas .equals() compares the exact values. The literal content.
    String a = new String("hello");
    String b = new String("hello");
    System.out.println(a.equals(b)); // This will print "true" because the contents of a and b are the same.

*/

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//        Repetitive and bad
//        if (fruit.equals("mango")){
//            System.out.println("King of fruits");
//        }
//
//        if (fruit.equals("orange")){
//            System.out.println("round fruit");
//        }

//        switch_cases.Switch Syntax
//        switch (expression){
//        // cases:
//          case one:
                // do something
//              break;
//          case two:
//               // do something
//               break;
//          default:
//              // do something
//        }

//      New Syntax:
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("Small red fruit");
//            case "Banana" -> System.out.println("Naughty fruit");
//            default -> System.out.println("WTF is this " + fruit + "?");
//        }

        int day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("What are you entering, idiot!? Go and study in 1st class again, you dumb ass!");
        }

//      Weekend or Weekday:
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
