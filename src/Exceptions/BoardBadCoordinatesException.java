package Exceptions;

public class BoardBadCoordinatesException extends RuntimeException {
    public BoardBadCoordinatesException(String message){
        super(message);
    }
}
