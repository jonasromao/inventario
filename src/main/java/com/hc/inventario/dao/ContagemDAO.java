package com.hc.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hc.inventario.entity.Contagem;

public interface ContagemDAO extends JpaRepository<Contagem, Long>{

}
