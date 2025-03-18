package org.boilerplate.ticketboxuserservice.shared.exception.custom;

public class BadRequestException extends BaseException {
    public BadRequestException(String errorCode) {
        super("Bad Request", errorCode);
    }
}
