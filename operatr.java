class operatr{
    public static void main(String[] a){

        // Different Types of Operators
        // Arithmetic Operator

        int num1 = 12, num2 = 6;

        System.out.println("First Number : " + num1);
        System.out.println("Second Number : " + num2);

        System.out.println("\nArithmetic Operators : ");
        System.out.println("Addition : " + (num1 + num2));
        System.out.println("Subtraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Divison : " + (num1 / num2));
        System.out.println("Modulus Division : " + (num1 % num2));

        // Unary Operators
        System.out.println("\nUnary Operators : ");
        
        System.out.println("Post Increment to First Number : " + num1++);
        System.out.println("Pre Increment to Second Number : " + ++num2);
        System.out.println("Post Decrement to First Number : " + num1--);
        System.out.println("Pre Decrement to Second Number : " + --num2);

        // Assignment Operator
        System.out.println("\nAssignment Operators : ");

        System.out.println("Assignment Addition : " + (num1 += 2));
        System.out.println("Assignment Subtraction : " + (num2 -= 2));
        System.out.println("Assignment Multiplication : " + (num2 *= 2));
        System.out.println("Assignment Divison : " + (num2 /= 2));

        // Relational Operator
        System.out.println("\nRelational Operators : ");

        System.out.println("Checking Equality : " + (num1 == num2));
        System.out.println("Checking if first number is greater than second one : " + (num1 > num2));
        System.out.println("Checking if second number is greater than first one : " + (num1 < num2));
        System.out.println("Checking if first number is greater than or equal to second number : " + (num1 >= num2));
        System.out.println("Checking if second number is greater than or equalt to first number : " + (num1 <= num2));
        System.out.println("Checking if the numbers are unequal : " + (num1 != num2));

        // Some Boolean Value
        boolean bool1 = true;
        boolean bool2 = false;

        // Logical Operator
        System.out.println("\nLogical Operators : ");

        System.out.println("Logical OR || operator : " + (bool1 && bool2));
        System.out.println("Logical AND && operator : " + (bool1 || bool2));
        System.out.println("Logical NOT ! operator : " + (!bool1));

        // Ternary Operator
        System.out.println("\nTernary Operator : ");

        System.out.println("Checking if the first number is greater than second one : " + ((num1 > num2) ? true : false));

        // Bitwise Operator
        System.out.println("\nBitwise Operators : ");

        System.out.println("Bitwise & AND Operator : " + (num1 & num2));
        System.out.println("Bitwise | OR Operator : " + (num1 | num2));
        System.out.println("Bitwise ^ NOT Operator : " + (num1 ^ num2));
        System.out.println("Bitwise ~ Operator : " + (~num1));

        // Bitwise Shift Operator
        System.out.println("\nBitwise Shift Operator : ");

        System.out.println("Bitwise << Operator : " + (num1 << 2));
        System.out.println("Bitwise >> Operator : " + (num1 >> 1));
        System.out.println("Bitwise >>> Operator : " + (num2 >>> 2));

    }
}