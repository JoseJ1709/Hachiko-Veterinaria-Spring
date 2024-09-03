package com.example.demo.ErrorHandling;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ErrorController{

    @ExceptionHandler(NotFoundException.class)
    public String handleNotFoundException(Model model, NotFoundException ex) {
        model.addAttribute("errorMessage", "Cliente no encontrado con cedula: " + ex.getId());
        return "pagina_error2";
    }

    @ExceptionHandler(NoSuchElementException.class)
    public String handleNoSuchElementException(Model model, NoSuchElementException ex) {
        return "pagina_error";
    }
}