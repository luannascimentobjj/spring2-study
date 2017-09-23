package br.com.casadocodigo.loja.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerController {

	@ExceptionHandler(Exception.class)
	public ModelAndView trataExceptionGenerica(Exception exception) {
		System.out.println("Erro genério acontecendo");
		exception.printStackTrace();
		
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", exception);
		return mv;
	}
	
}
