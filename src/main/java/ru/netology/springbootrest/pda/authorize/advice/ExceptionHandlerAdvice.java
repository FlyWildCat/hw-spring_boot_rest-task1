package ru.netology.springbootrest.pda.authorize.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.springbootrest.pda.authorize.exception.InvalidCredentials;
import ru.netology.springbootrest.pda.authorize.exception.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> icHandler (InvalidCredentials e) {
        System.out.println("Exception: " + e.getMessage());
        return new ResponseEntity<>( "Exception: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> uuHandler (UnauthorizedUser e) {
        System.out.println("Exception: " + e.getMessage());
        return new ResponseEntity<>("Exception: " + e.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
