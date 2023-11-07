package adn.arus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adn.arus.model.Formulario;
import adn.arus.service.FormularioService;


@RestController
@RequestMapping("/formulario")
public class FormularioController {
 
	@Autowired
	private FormularioService formularioService;
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Formulario formulario){
		return new ResponseEntity<>(formularioService.save(formulario), HttpStatus.OK);
	}
}
