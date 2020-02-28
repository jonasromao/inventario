package com.hc.inventario.entity;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.hc.inventario.enums.TipoLote;

@Entity
public class Lote extends DefaultEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigo;

	private TipoLote tipoLote;

	private Usuario usuario;

	@JoinColumn(name = "id_iventario", referencedColumnName = "id")
	@ManyToOne
	private Inventario inventario;

	private Instant inicio;

	private Instant fim;

	@Column(columnDefinition = "boolean default false")
	private boolean verificarValidade;

	public Lote() {

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public TipoLote getTipoLote() {
		return tipoLote;
	}

	public void setTipoLote(TipoLote tipoLote) {
		this.tipoLote = tipoLote;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

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

	public boolean isVerificarValidade() {
		return verificarValidade;
	}

	public void setVerificarValidade(boolean verificarValidade) {
		this.verificarValidade = verificarValidade;
	}

}
