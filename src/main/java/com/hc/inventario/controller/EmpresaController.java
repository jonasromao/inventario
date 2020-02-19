package com.hc.inventario.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hc.inventario.business.EmpresaBusiness;
import com.hc.inventario.dto.EmpresaDTO;
import com.hc.inventario.entity.Empresa;

@RestController
@RequestMapping({ "/empresa" })
public class EmpresaController extends DefaultController {

	@Autowired
	private EmpresaBusiness empresaBusiness;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@PostMapping(consumes = { "application/json" })
	public ResponseEntity<Object> salvar(@RequestBody EmpresaDTO empresaDTO) {
		try {

			Empresa empresa = modelMapper.map(empresaDTO, Empresa.class);
			
			empresa = empresaBusiness.merge(empresa);
			
			var dto = modelMapper.map(empresa, EmpresaDTO.class);

			return getResponseOk(dto);

		} catch (Exception ex) {
			return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GetMapping()
	public ResponseEntity<Object> findAll(@RequestParam(required=false) String nome) {
		try {
			
			nome = (nome == null ? "" : nome );
			
			var empresas = empresaBusiness.findAll(nome);

			List<EmpresaDTO> empresasDTO = new ArrayList<EmpresaDTO>();
			empresas.forEach(empresa -> {
				empresasDTO.add(modelMapper.map(empresa, EmpresaDTO.class));
			});

			return getResponseOk(empresasDTO);
		} catch (Exception ex) {
			return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
