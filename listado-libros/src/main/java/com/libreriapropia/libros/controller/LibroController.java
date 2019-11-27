package com.libreriapropia.libros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.libreriapropia.libros.model.Libro;
import com.libreriapropia.libros.service.LibroServiceInterface;

@RestController
public class LibroController {

	@Autowired
	private LibroServiceInterface libroService;
	
	@RequestMapping(value="/addLibro",method=RequestMethod.POST,produces="application/json")
	public String addLibro(@RequestBody Libro libro) {
		return libroService.addLibro(libro);
	}
	
}
