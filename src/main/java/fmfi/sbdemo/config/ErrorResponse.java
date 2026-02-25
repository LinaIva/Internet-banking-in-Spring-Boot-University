package fmfi.sbdemo.config;

import java.time.LocalDateTime;

public class ErrorResponse {
    private String message;
    private String errorCode;
    private String detail;
    private LocalDateTime timestamp;

    public ErrorResponse(String message, String errorCode, String detail) {
        this.message = message;
        this.errorCode = errorCode;
        this.detail = detail;
        this.timestamp = LocalDateTime.now();
    }
}
