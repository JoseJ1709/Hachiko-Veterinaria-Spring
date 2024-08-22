package com.example.demo.controlador;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class ErrorController{


    @ExceptionHandler(NotFoundException.class)
    public String error(Model model, NotFoundException ex){

        return "pagina_error";
    }
    @ExceptionHandler(NoSuchElementException.class)
    public String error(Model model, NoSuchElementException ex){

        return "pagina_error";
    }
}