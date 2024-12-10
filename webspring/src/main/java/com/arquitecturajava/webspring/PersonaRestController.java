package com.arquitecturajava.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	@Autowired
	private PersonaService servicio;

	public void add(Persona persona) {
		servicio.add(persona);
	}

	@GetMapping
	public List<Persona> buscarTodos() {
		return servicio.buscarTodos();
	}
}
