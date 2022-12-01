package service.impl;

import java.util.function.Supplier;

public class NotFoundIdException extends Exception {

    public NotFoundIdException(String message) {
        super(message);
    }

}