package com.hc.inventario.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hc.inventario.entity.Empresa;

public interface EmpresaDAO extends JpaRepository<Empresa, Long>{
	
	List<Empresa> findByNomeContains(String nome);
}
