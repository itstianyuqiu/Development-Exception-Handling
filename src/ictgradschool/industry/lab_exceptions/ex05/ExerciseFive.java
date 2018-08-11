package ictgradschool.industry.lab_exceptions.ex05;

import ictgradschool.Keyboard;

/**
 * TODO Write a program according to the Exercise Five guidelines in your lab handout.
 */
public class ExerciseFive {

    public void start() {
        // TODO Write the codes :)
        System.out.print("Enter a string of at most 100 characters: ");
        try {
            String characters = getCharacters();
        } catch (ExceedMaxStringLengthException e) {
            System.out.println(e.getMessage());
        } catch (InvalidWordException e) {
            System.out.println(e.getMessage());
        }
    }

    // TODO Write some methods to help you.
    private String getCharacters() throws ExceedMaxStringLengthException, InvalidWordException {

        String characters = Keyboard.readInput();
        if (characters.length() > 100) {
            throw new ExceedMaxStringLengthException("more than 100 characters");
        }
        String[] strChars = characters.split(" ");
//        System.out.println(strChars[1] + strChars.length);
        for (int i = 0; i < strChars.length; i++) {
            if (strChars[i] != null && !(strChars[i].equals(""))) {
                char cha[] = strChars[i].substring(0, 1).toCharArray();
                if (!((cha[0] >= 65 && cha[0] <= 90) || (cha[0] >= 97 && cha[0] <= 122))) {
                    throw new InvalidWordException("contains invalid words");
                }
            }
        }

        return characters;
    }


    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        new ExerciseFive().start();
    }
}
