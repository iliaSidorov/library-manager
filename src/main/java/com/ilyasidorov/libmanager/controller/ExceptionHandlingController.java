package com.ilyasidorov.libmanager.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlingController {

    @Autowired
    private Logger logger;

    @ExceptionHandler(value = Exception.class)
    public String handleError(HttpServletRequest req, Exception e) throws Exception {
        logger.error("Request: " + req.getRequestURL() + " raised " + e);

        return "error";
    }

}
