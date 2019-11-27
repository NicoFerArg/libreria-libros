package com.libreriapropia.libros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreriapropia.libros.dao.LibroRepository;
import com.libreriapropia.libros.model.Libro;

@Service
public class LibroService {

	@Autowired
	private LibroRepository libroRepository;
	
	public String addLibro(Libro libro) {
		libroRepository.save(libro);
		return "Added product with id: " + libro.getId();
	}
	
}
