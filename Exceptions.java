package se.ifmo.lab4;

public class Exceptions {
    public static class NotEnoughSpaceException extends Exception{
        public NotEnoughSpaceException(String message){
            super(message);
        }
    }
    public static class NotEnoughWorkException extends RuntimeException{
        public NotEnoughWorkException(String message){
            super(message);
        }
    }
}
