package com.arquitecturajava.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arquitecturajava.webspring.models.Persona;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository repositorio;
	
	public void add(Persona persona) {
		
		repositorio.add(persona);
	}

	public List<Persona> buscarTodos() {
		return repositorio.buscarTodos();
	}
}
