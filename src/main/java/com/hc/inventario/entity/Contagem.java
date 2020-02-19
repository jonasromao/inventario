package com.hc.inventario.entity;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contagem extends DefaultEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@JoinColumn( name = "id_lote", referencedColumnName = "id" )
	@ManyToOne
	private Lote lote;

	private String codigo;

	private Instant hora;

	private int quantidade;

	private Instant validade;
	
	@Column(columnDefinition = "boolean default false")
	private boolean possuiAvaria;
	
	private int quantidadeAvaria;

	public Contagem() {

	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Instant getHora() {
		return hora;
	}

	public void setHora(Instant hora) {
		this.hora = hora;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Instant getValidade() {
		return validade;
	}

	public void setValidade(Instant validade) {
		this.validade = validade;
	}

	public boolean isPossuiAvaria() {
		return possuiAvaria;
	}

	public void setPossuiAvaria(boolean possuiAvaria) {
		this.possuiAvaria = possuiAvaria;
	}

	public int getQuantidadeAvaria() {
		return quantidadeAvaria;
	}

	public void setQuantidadeAvaria(int quantidadeAvaria) {
		this.quantidadeAvaria = quantidadeAvaria;
	}

}
