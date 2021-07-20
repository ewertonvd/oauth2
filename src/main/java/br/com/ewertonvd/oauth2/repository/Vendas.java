package br.com.ewertonvd.oauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ewertonvd.oauth2.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {
}