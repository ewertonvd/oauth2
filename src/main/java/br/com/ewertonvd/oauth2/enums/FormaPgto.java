package br.com.ewertonvd.oauth2.enums;

public enum FormaPgto {
	DEBITO_AVISTA(0L, "Débito à vista"),
	CREDITO_AVISTA(1L, "Crédito à vista"),
	CREDITO_PARCELADO(2L, "Crédito parcelado");

	private final Long id;

	private final String descricao;

	private FormaPgto(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
}