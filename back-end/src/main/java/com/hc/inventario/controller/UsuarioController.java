package com.hc.inventario.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hc.inventario.business.UsuarioBusiness;
import com.hc.inventario.dto.UsuarioDTO;
import com.hc.inventario.entity.Usuario;

@RestController
@RequestMapping({ "/usuario" })
public class UsuarioController extends DefaultController {

	@Autowired
	private UsuarioBusiness usuarioBusiness;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping(consumes = { "application/json" })
	public ResponseEntity<Object> salvar(@RequestBody UsuarioDTO usuarioDTO) {
		try {

			Usuario usuario = modelMapper.map(usuarioDTO, Usuario.class);
			usuario = usuarioBusiness.merge(usuario);
			var dto = modelMapper.map(usuario, UsuarioDTO.class);

			return getResponseOk(dto);

		} catch (Exception ex) {
			return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping()
	public ResponseEntity<Object> findAll(@RequestParam(required=false) String nome, @RequestParam(required=false) String login) {
		try {
			var usuarios = usuarioBusiness.findAll(nome, login);

			List<UsuarioDTO> usuariosDTO = new ArrayList<UsuarioDTO>();
			usuarios.forEach(usuario -> {
				usuariosDTO.add(modelMapper.map(usuario, UsuarioDTO.class));
			});

			return getResponseOk(usuariosDTO);
		} catch (Exception ex) {
			return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping( path="/ativar/{id}", consumes = { "application/json" } )
	public ResponseEntity<Object> ativar(@PathVariable( "id" ) Long id) {
		try {
			
			usuarioBusiness.ativarUsuario(id);
			
			return getResponseOk("");

		} catch (Exception ex) {
			return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping( path="/inativar/{id}", consumes = { "application/json" } )
	public ResponseEntity<Object> inativar(@PathVariable( "id" ) Long id) {
		try {
			
			usuarioBusiness.inativarUsuario(id);
			
			return getResponseOk("");

		} catch (Exception ex) {
			return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
