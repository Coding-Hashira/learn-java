package loops_and_conditionals;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = input.nextInt();

//        if (salary > 25_000) {
//            salary += 2000;
//        } else {
//            salary += 1000;
//        }

//        multiple if statements
        if (salary > 50_000){
            salary += 5000;
        } else if (salary > 25_000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println("Your new salary is: " + salary);
    }
}
