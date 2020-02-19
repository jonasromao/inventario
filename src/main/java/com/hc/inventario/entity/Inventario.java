package com.hc.inventario.entity;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Inventario extends DefaultEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Instant inicio;

	private Instant fim;

	@ManyToMany
	@JoinTable(
			  name = "inventario_usuario_contagem", 
			  joinColumns = @JoinColumn(name = "id_inventario"), 
			  inverseJoinColumns = @JoinColumn(name = "id_usuario"))
	private List<Usuario> usuarios;

	private Empresa empresa;

	@OneToMany( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, orphanRemoval = true, mappedBy = "inventario" )
	private List<Lote> lotes;

	public Instant getInicio() {
		return inicio;
	}

	public void setInicio(Instant inicio) {
		this.inicio = inicio;
	}

	public Instant getFim() {
		return fim;
	}

	public void setFim(Instant fim) {
		this.fim = fim;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Lote> getLotes() {
		return lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

}
