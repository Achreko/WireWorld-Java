package Exceptions;

public class BadArgumentException extends RuntimeException {
    public BadArgumentException(String message){
        super(message);
    }
}
