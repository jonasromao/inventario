package com.hc.inventario.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hc.inventario.business.UsuarioBusiness;
import com.hc.inventario.dto.UsuarioDTO;
import com.hc.inventario.entity.Usuario;

@RestController
@RequestMapping( { "/usuario" } )
public class UsuarioController extends DefaultController {

	@Autowired
	private UsuarioBusiness usuarioBusiness;
	
	@Autowired
	private ModelMapper modelMapper;

	
	@PostMapping( consumes = { "application/json" } )
	public ResponseEntity<Object> salvar( @RequestBody UsuarioDTO usuarioDTO ) {
		try {

			Usuario usuario = modelMapper.map( usuarioDTO, Usuario.class );
			usuario = usuarioBusiness.merge( usuario );
			var dto = modelMapper.map( usuario, UsuarioDTO.class );
			
			return getResponseOk(dto);
		} catch ( Exception ex ) {
			return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		} 
	}
	
	@GetMapping()
	public String jose() {
		return "Rato la la la oooooo";
	}
	

	
}
