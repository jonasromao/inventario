package com.hc.inventario.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Empresa extends DefaultEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	
	private String cep;
	
	private String numeroEndereco;
	
	private String pontoDeReferencia;
	
	private String nomeContatoPrincipal;
	
	private String classificacaoRelacionamento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getPontoDeReferencia() {
		return pontoDeReferencia;
	}

	public void setPontoDeReferencia(String pontoDeReferencia) {
		this.pontoDeReferencia = pontoDeReferencia;
	}

	public String getNomeContatoPrincipal() {
		return nomeContatoPrincipal;
	}

	public void setNomeContatoPrincipal(String nomeContatoPrincipal) {
		this.nomeContatoPrincipal = nomeContatoPrincipal;
	}

	public String getClassificacaoRelacionamento() {
		return classificacaoRelacionamento;
	}

	public void setClassificacaoRelacionamento(String classificacaoRelacionamento) {
		this.classificacaoRelacionamento = classificacaoRelacionamento;
	}
	
	
	
	
}
