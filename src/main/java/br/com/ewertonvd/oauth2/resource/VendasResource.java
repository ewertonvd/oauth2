package br.com.ewertonvd.oauth2.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ewertonvd.oauth2.model.Venda;
import br.com.ewertonvd.oauth2.repository.Vendas;

@RestController
@RequestMapping("/vendas")
public class VendasResource {

	@Autowired
	private Vendas vendas;

	@GetMapping
	public List<Venda> listar() {
		return this.vendas.findAll();
	}
}