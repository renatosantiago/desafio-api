package app.com.desafio.resource.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import app.com.desafio.service.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
    StandardError erro = new StandardError();
    erro.setTimeStamp(Instant.now());
    erro.setStatus(HttpStatus.NOT_FOUND.value());
    erro.setError("Resource not found");
    erro.setMessage(e.getMessage());
    erro.setPath(request.getRequestURI());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
  }
}
