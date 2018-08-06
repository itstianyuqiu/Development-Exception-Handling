package ictgradschool.industry.lab_exceptions.ex05;

public class ExceedMaxStringLengthException extends Exception {
    public ExceedMaxStringLengthException() {
    }

    public ExceedMaxStringLengthException(String message) {
        super(message);
    }
}
