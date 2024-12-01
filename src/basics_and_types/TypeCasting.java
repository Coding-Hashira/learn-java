package basics_and_types;

public class TypeCasting {
    public static void main(String[] args) {
//        Type Casting:
//        1. Widening or Automatic Type Conversion
//        If you have a variable with 1 type, and you assign it another type, it'll automatically do the type conversion if these two conditions are met:
//        Both types must be compatible. Strings can't be typecast automatically into booleans or integers.
//        A smaller datatype must be assigned to a bigger one.
//        byte -> short -> int -> long -> float -> double
//        float num = 1;
//
//        num = 23;

//        This gives error:
//        int num2 = 50;
//
//        num2 = 50;

//        2. Narrowing or Explicit Type Conversion:
//        This happens when we want to assign a value of larger data type to a smaller data type.

//        int marks = (int) (99.98);
//
//        System.out.println(marks);

//        # byte -> max value -> 256
//        int a = 257;
//        byte b = ((byte) a); // 257 % 256 = 1
//
//        System.out.println(b);

//        3. Automatic Type Promotion in Expressions
//        While evaluating expressions, the intermediate value may exceed the range of operands and hence the expression value will be promoted.
//        Each byte, short, char is promoted to int automatically by Java.
//        If any one of the operand is long, float or double, the whole expression is converted into it.

//        byte a = 40;
//        byte b = 50;
//        byte c = a * 2; Will give error as 'a' gets cast into integer in expression, which is not assignable to byte.
//        int product = a * b;

//        Java follows Unicode.
//        System.out.println("なるほど");

        byte b = 42;
        char c = 'J';
        short s = 1024;
        int i = 50_000;
        float f = 5.67f;
        double d = 0.124353212;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
    }
}
