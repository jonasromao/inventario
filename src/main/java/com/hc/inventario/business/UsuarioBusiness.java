package com.hc.inventario.business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc.inventario.dao.UsuarioDAO;
import com.hc.inventario.entity.Usuario;
import com.hc.inventario.utils.AppUtils;
import com.hc.inventario.utils.BusinessException;

@Service
public class UsuarioBusiness {

	@Autowired
	private UsuarioDAO usuarioDAO;

	public Usuario merge(Usuario usuario) throws BusinessException {

		validarUsuario(usuario);

		return usuarioDAO.save(usuario);

	}

	public void ativarUsuario(Long idUsuario) throws BusinessException {
		ativarInativarUsuario(idUsuario, true);
	}
	
	public void inativarUsuario(Long idUsuario) throws BusinessException {
		ativarInativarUsuario(idUsuario, false);
	}

	private void ativarInativarUsuario(Long idUsuario, boolean situacao) throws BusinessException {
		Optional<Usuario> usuarioOptional = usuarioDAO.findById(idUsuario);

		if (!usuarioOptional.isPresent()) {
			throw new BusinessException("Nenhum usuário encontrado com o id informado");
		}

		Usuario usuario = usuarioOptional.get();

		usuario.setAtivo(situacao);

		usuarioDAO.save(usuario);
	}

	public void validarUsuario(Usuario usuario) throws BusinessException {

		if (AppUtils.isNullOrEmpty(usuario.getNome())) {
			throw new BusinessException("Nome é obrigatório");
		}

		if (AppUtils.isNullOrEmpty(usuario.getLogin())) {
			throw new BusinessException("Login é obrigatório");
		}

		if (AppUtils.isNullOrEmpty(usuario.getSenha())) {
			throw new BusinessException("Senha é obrigatório");
		}

	}

}
