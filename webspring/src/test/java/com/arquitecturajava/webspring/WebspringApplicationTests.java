package com.arquitecturajava.webspring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arquitecturajava.webspring.models.Persona;

@SpringBootTest
class WebspringApplicationTests {

	@Autowired
	PersonaRepository repositorioPersona;
	
	@Test
	void addPersonaRepositorioTest() {
		
		repositorioPersona.add(new Persona("Juan"));
		assertEquals(repositorioPersona.buscarTodos().size(), 2);
	}

}
