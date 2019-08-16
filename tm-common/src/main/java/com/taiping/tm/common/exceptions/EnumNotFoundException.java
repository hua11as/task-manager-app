package com.taiping.tm.common.exceptions;

/**
 * desc:
 * author: as
 * date: 2019/8/16
 */
public class EnumNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -356716329743477091L;

    public EnumNotFoundException() {
    }

    public EnumNotFoundException(String message) {
        super(message);
    }

    public EnumNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EnumNotFoundException(Throwable cause) {
        super(cause);
    }

    public static EnumNotFoundException keyIsEmpty() {
        return new EnumNotFoundException("key is empty");
    }

    public static EnumNotFoundException enumNotFound(Object key, Class clazz) {
        return new EnumNotFoundException("use key " + key.toString() + " was not found enum " + clazz);
    }
}
