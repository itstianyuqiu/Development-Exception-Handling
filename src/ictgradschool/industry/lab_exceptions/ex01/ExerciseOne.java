package ictgradschool.industry.lab_exceptions.ex01;

import ictgradschool.Keyboard;

public class ExerciseOne {
    //nums is null, nums.length hasn't value, the exception is NullPointerException,there is no catch get it.
    private void tryCatch01() {
        int result = 0;
        int[] nums = null;
        try {
            result = nums.length;
            System.out.println("See you");
//        } catch (ArithmeticException e) {
//
        } catch (NullPointerException ee) {
            System.out.println("Problem 1");
            result = -1;
        }
        System.out.println("Result: " + result);
    }

    private void tryCatch02() {
//        int num1 = 120, num2 = 120, result = 0;
//        result = num2 / (num1 - num2);
//        System.out.println("Result: " + result);
        int num1 = 120, num2 = 120, result = 0;
        try {
            result = num2 / (num1 - num2);
        } catch (ArithmeticException e) {
            System.out.println("Problem 2:div by zero");
            result = -1;
        }
        System.out.println("Result: " + result);
    }

    private void tryCatch03() {
//        int result = 0;
//        String[] items = { "one", "two", null };
//        result = items[2].length();
//        System.out.println("Result: " + result);
        int result = 0;
        try {
            String[] items = {"one", "two", null};
            result = items[2].length();
        } catch (NullPointerException e) {
            System.out.println("Problem 3");
            result = -1;
        }
        System.out.println("Result: " + result);
    }

    /*
    private void tryCatch04() {
try {
int num = 0;
System.out.println("Enter number: ");
num = Integer.parseInt(Keyboard.readInput());
System.out.println("Thank you");
} catch (NumberFormatException e) {
System.out.println("Input error");
num = -1;
}
System.out.println("Number: " + num);
}
     */
    private void tryCatch04() {
        int num = 0;
        try {
            System.out.println("Enter number: ");
            num = Integer.parseInt(Keyboard.readInput());
            System.out.println("Thank you");
        } catch (NumberFormatException e) {
            System.out.println("Problem 4:Input error");
            num = -1;
        }
        System.out.println("Number: " + num);
    }

    /*
    private int tryCatch05() {
    int result = 0;
    String[] nums = { 2, 3, 4, -1, 4 };
    try {
    result = nums[nums[3]];
    System.out.println("See you");
    } catch {
    System.out.println("Number error");
    result = -1;
    }
    return result;
    }
     */
    private int tryCatch05() {
        int result = 0;
        int[] nums = {2, 3, 4, -1, 4};
        try {
            result = nums[nums[3]];
            System.out.println("See you");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Problem 5:Number error");
            result = -1;
        }
        return result;
    }

    //    6.c f a b error      X
//    c b error
    private void tryCatch06() {
        try {
            try06(0, "");
            System.out.println("A");
        } catch (ArithmeticException e) {
            System.out.println("B Error");
        }
    }

    private void try06(int num, String s) {
        System.out.println("C");
        try {
            num = s.length();
            num = 200 / num;
        } catch (NullPointerException e) {
            System.out.println("E Error");
        }
        System.out.println("F");
    }

    //
    private void tryCatch07() {
        try {
            try07(0, null);
        } catch (RuntimeException e) {
            System.out.println("A");
        }
    }

    private void try07(int num, String s) {

        try {
            System.out.println("B");
            num = s.length();
        } catch (NullPointerException e) {

            System.out.println("C");
        }


    }

    //    ceb
    private void tryCatch08() {
        try {
            try08(0, null);
            System.out.println("A");
        } catch (NullPointerException e) {
            System.out.println("B");
        }
    }

    private void try08(int num, String s) {
        System.out.println("C");
        try {
            num = s.length();
            System.out.println("D");
        } finally {
            System.out.println("E");
        }
    }

    //Null String b
    /*
    java.lang.NullPointerException: Null String
    B
     */
    private void throwsClause09() {
        try {
            throws09(null);
            System.out.println("A");
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("B");
    }

    private void throws09(String numS) throws NullPointerException {
        if (numS == null) {
            throw new NullPointerException("Null String");
        }
        System.out.println("C");
    }

    //b
    /*
    Exception in thread "main" java.lang.NullPointerException: Bad String
    B
	at ictgradschool.industry.lab_exceptions.ex01.ExerciseOne.throws10(ExerciseOne.java:197)
	at ictgradschool.industry.lab_exceptions.ex01.ExerciseOne.throwsClause10(ExerciseOne.java:186)
	at ictgradschool.industry.lab_exceptions.ex01.ExerciseOne.main(ExerciseOne.java:203)
     */
    private void throwsClause10() {
        try {
            throws10(null);
            System.out.println("A");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("B");
        }
        System.out.println("C");
    }

    private void throws10(String numS) throws NullPointerException {
        if (numS == null) {
            throw new NullPointerException("Bad String");
        }
        System.out.println("D");
    }

    public static void main(String[] args) {
        ExerciseOne e = new ExerciseOne();
        e.tryCatch07();
    }
}
