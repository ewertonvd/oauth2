package br.com.ewertonvd.oauth2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.ewertonvd.oauth2.enums.FormaPgto;

@Entity
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long nrotransacao;

	private String nome;

	private FormaPgto formapgto;

	private double valorvenda;

	public Long getNroTransacao() {
		return nrotransacao;
	}

	public void setNroTransacao(Long nroTransacao) {
		this.nrotransacao = nroTransacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public FormaPgto getFormaPgto() {
		return formapgto;
	}

	public void setFormaPgto(FormaPgto formaPgto) {
		this.formapgto = formaPgto;
	}

	public double getValorVenda() {
		return valorvenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorvenda = valorVenda;
	}
}