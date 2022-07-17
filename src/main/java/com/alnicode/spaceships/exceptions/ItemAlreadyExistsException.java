package com.alnicode.spaceships.exceptions;

/**
 * Exception for items that already exists.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
public class ItemAlreadyExistsException extends Exception {

    public ItemAlreadyExistsException(String message) {
        super(message);
    }

}
