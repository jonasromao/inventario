package com.hc.inventario.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hc.inventario.entity.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

	List<Usuario> findByOrderByNomeAsc();
	
	@Query("SELECT u FROM Usuario u WHERE (:nome is null or u.nome like %:nome%) and (:login is null or u.login like %:login%)")
	List<Usuario> findByNomeAndLogin(@Param("nome") String nome,@Param("login") String login);
	
	
	
}
