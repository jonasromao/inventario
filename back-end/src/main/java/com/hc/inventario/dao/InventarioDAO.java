package com.hc.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hc.inventario.entity.Empresa;

public interface InventarioDAO extends JpaRepository<Empresa, Long>{

}
