package uz.test.demo.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ExceptionResponse {

    private String message;

    private LocalDateTime dataTime;

    public ExceptionResponse() {
    }

    public ExceptionResponse(String message, LocalDateTime dataTime) {
        this.message = message;
        this.dataTime = dataTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDataTime() {
        return dataTime;
    }

    public void setDataTime(LocalDateTime dataTime) {
        this.dataTime = dataTime;
    }
}
