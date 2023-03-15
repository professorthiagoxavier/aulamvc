package br.fiap.app.exemplo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fiap.app.exemplo.models.Produto;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@GetMapping("")
	public ModelAndView get() {
		ModelAndView model = new ModelAndView("produto/index");
		List<Produto> listaProduto = new ArrayList<Produto>();

		Produto produtoUm = new Produto(); 
		produtoUm.setId(new Long(1));
		produtoUm.setNome("Nike Lebrom");
		
		Produto produtoDois = new Produto();
		produtoDois.setId(new Long(2));
		produtoDois.setNome("Nike do Naldo");
		
		listaProduto.add(produtoUm);
		listaProduto.add(produtoDois);
		
		model.addObject("produtos", listaProduto);
		return model;
	}

}
