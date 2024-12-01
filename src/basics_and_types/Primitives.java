package basics_and_types;

/**
 * Data types which can't be broken further are known as primitive data types.
 */

public class Primitives {
    public static void main(String[] args) {
        int rollNo = 64;
        String name = "Jashan";
        char gender = 'M';
        float marks = 98.89f;
        double largeDecimalNumbers = 99.85;
        long largeIntegerNumbers = 987654321566877L;
        boolean bool = true;

        Integer rno = 64;
        // Here: | 64 -> Literal | rno -> Identifier |

        int a = 234_000_000;

        System.out.println(a);
    }
}