package switch_cases;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1 -> System.out.println("Jashan Mago");
            case 2 -> System.out.println("Pushkaraj");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department: Vishvesh");
                    case "Design" -> System.out.println("Design Department: Richa");
                    default -> System.out.println("Kritarth");
                }
            }
            default -> System.out.println("Enter valid employee ID, idiot!");
        }
    }
}
