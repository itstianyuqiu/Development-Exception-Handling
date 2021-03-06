package ictgradschool.industry.lab_exceptions.ex04;

import ictgradschool.Keyboard;

/**
 * A simple program that generates an array of random numbers, then displays
 * one of them (user's choice).
 */
public class ExerciseFour {


    /**
     * Runs the program.
     * <p>
     * TODO Handle your InvalidIndexException, IndexTooLowException, and IndexTooHighException appropriately.
     */
    public void start() {

        int[] myArray = generateArray();

        // TODO Handle any exceptions generated by this line appropriately.
        // TODO If an exception is thrown, display an appropriate error message and let the user try again.
        int index = 0;
        while (true) {
            try {
                index = getArrayIndexFromUser();
                break;
            } catch (InvalidIndexException e) {
                System.out.println(e.getMessage());

            } catch (IndexTooLowException e) {
                System.out.println(e.getMessage());

            } catch (IndexTooHighException e) {
                System.out.println(e.getMessage());

            }
        }

        System.out.println("The element at index " + index + " is: " + myArray[index]);
    }

    /**
     * Gets an array index from the given user. Currently error-prone as it doesn't check whether the user
     * inputs valid numbers of the correct size.
     * <p>
     * TODO Follow these steps:
     * <ol>
     * <li>Create three new checked Exception classes (i.e. extends Exception):
     * <ul>
     * <li>InvalidIndexException</li>
     * <li>IndexTooLowException</li>
     * <li>IndexTooHighException</li>
     * </ul>
     * </li>
     * <li>Declare this method to throw these three kinds of exceptions (using the throws clause)</li>
     * <li>Throw InvalidIndexException if the user doesn't enter an integer</li>
     * <li>Throw IndexTooLowException if the user enters an integer that's too small to be a valid index</li>
     * <li>Throw IndexTooHighException if the user enters an integer that's too large to be a valid index</li>
     * </ol>
     */
    private int getArrayIndexFromUser() throws InvalidIndexException, IndexTooLowException, IndexTooHighException {

        System.out.print("Enter an index: ");

        int index;
        try {
            index = Integer.parseInt(Keyboard.readInput());
        } catch (NumberFormatException e) {
            throw new InvalidIndexException("doesn’t enter an integer");
        }
        if (index < 0) {
            throw new IndexTooLowException("enters a number that’s too small to be a valid index");
        } else if (index > 4) {
            throw new IndexTooHighException("enters a number that’s too large to be a valid index");
        }

        return index;

    }

    /**
     * Creates and returns an array with five random numbers.
     */
    private int[] generateArray() {

        // TODO Create an array of length five, and fill it with random integers
        // TODO (say, between 1 - 1000, but doesn't really matter).
        int[] myArr = new int[5];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * 1000 + 1);
        }
        return myArr;
    }

    public static void main(String[] args) {
        new ExerciseFour().start();
    }
}
