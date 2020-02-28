package com.hc.inventario.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hc.inventario.dao.EmpresaDAO;
import com.hc.inventario.entity.Empresa;
import com.hc.inventario.utils.AppUtils;
import com.hc.inventario.utils.BusinessException;

@Service
public class EmpresaBusiness {

	@Autowired
	private EmpresaDAO empresaDAO;

	public List<Empresa> findAll(String nome) {

		return empresaDAO.findByNomeContains(nome);
	}

	public Empresa merge(Empresa empresa) throws BusinessException {

		validarEmpresa(empresa);

		return empresaDAO.save(empresa);
	}

	public void validarEmpresa(Empresa empresa) throws BusinessException {

		if (AppUtils.isNullOrEmpty(empresa.getNome())) {
			throw new BusinessException("Nome é obrigatório");
		}

		if (AppUtils.isNullOrEmpty(empresa.getNomeContatoPrincipal())) {
			throw new BusinessException("Nome contato principal é obrigatório");
		}
	}

}
