package com.hc.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hc.inventario.entity.Lote;

public interface LoteDAO extends JpaRepository<Lote, Long>{

}
