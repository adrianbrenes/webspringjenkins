package com.arquitecturajava.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arquitecturajava.webspring.dtos.PersonaDto;
import com.arquitecturajava.webspring.mappers.PersonaMapper;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	@Autowired
	private PersonaService servicio;

	public void add(PersonaDto persona) {
		servicio.add(PersonaMapper.toBo(persona));
	}

	@GetMapping
	public List<PersonaDto> buscarTodos() {
		return (List<PersonaDto>) servicio.buscarTodos().stream().map((p)->new PersonaDto(p.getNombre().toUpperCase()));
	}
}
