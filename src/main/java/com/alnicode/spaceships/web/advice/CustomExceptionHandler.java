package com.alnicode.spaceships.web.advice;

import com.alnicode.spaceships.exceptions.ItemAlreadyExistsException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Here is the exception handlers.
 *
 * @author Alben Bustamante
 * @since 1.0
 * @version 1.0
 */
@RestControllerAdvice
public class CustomExceptionHandler {

    /**
     * Customize the exception response.
     *
     * @param ex the exception.
     * @return a {@link ResponseEntity} with the body.
     */
    @ExceptionHandler(ItemAlreadyExistsException.class)
    public ResponseEntity<Object> handleItemAlreadyExists(ItemAlreadyExistsException ex) {
        final Map<String, String> body = new LinkedHashMap<>();

        body.put("timestamp", timestamp());
        body.put("name", ex.getMessage());

        return ResponseEntity.badRequest().body(body);
    }

    /**
     * @return the current time.
     */
    private String timestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:ss"));
    }

}
