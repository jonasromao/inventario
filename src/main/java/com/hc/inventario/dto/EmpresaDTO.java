package com.hc.inventario.dto;

public class EmpresaDTO {

	private Long id;

	private String nome;

	private String cep;

	private String numeroEndereco;

	private String pontoDeReferencia;

	private String nomeContatoPrincipal;

	private String classificacaoRelacionamento;

	public EmpresaDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
