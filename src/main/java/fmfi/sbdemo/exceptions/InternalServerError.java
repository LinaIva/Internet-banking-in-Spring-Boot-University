package fmfi.sbdemo.exceptions;

import lombok.Getter;

@Getter
public class InternalServerError extends RuntimeException {
    private final String errorCode;
    private final String detail;

    public InternalServerError(String message, String errorCode, String detail) {
        super(message);
        this.errorCode = errorCode;
        this.detail = detail;
    }
}
