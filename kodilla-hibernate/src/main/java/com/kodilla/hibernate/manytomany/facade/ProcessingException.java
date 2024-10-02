package com.kodilla.hibernate.manytomany.facade;

public class ProcessingException extends Exception{
    public static String NO_VALUE_ERROR = "Cannot return value";
    public ProcessingException(String message) {
        super(message);
    }
}
