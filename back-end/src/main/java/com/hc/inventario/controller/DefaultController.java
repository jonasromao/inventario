package com.hc.inventario.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DefaultController {
	protected ResponseEntity<Object> getResponseOk(Object object) {

		return new ResponseEntity<Object>(object, HttpStatus.OK);
	}

}
