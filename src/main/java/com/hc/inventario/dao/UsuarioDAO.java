package com.hc.inventario.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hc.inventario.entity.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

}
