package br.com.caelum.estoque.estoque.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import br.com.caelum.estoque.modelo.item.Filtro;
import br.com.caelum.estoque.modelo.item.Filtros;
import br.com.caelum.estoque.modelo.item.Item;
import br.com.caelum.estoque.modelo.item.ItemDao;
import br.com.caelum.estoque.modelo.item.ListaItens;

@WebService
public class EstoqueWS {
	private ItemDao dao = new ItemDao();
/**
	@WebMethod(operationName="todosOsItens")
	@WebResult(name="itens")
	public ListaItens getItens() {
		System.out.println("Chamado Todos Itens");
		List<Item> itens = dao.todosItens();
		return new ListaItens(itens);
	}
*/
/**
	@WebMethod(operationName="todosOsItens2")
	@ResponseWrapper(localName="itens")
	@WebResult(name="itens")
	@RequestWrapper(localName="listaItens")
	public ListaItens getItens2(@WebParam(name="filtros") Filtros filtros) {
		List<Filtro> lista = filtros.getLista();
		List<Item> itensResultado = dao.todosItens(lista);
		return new ListaItens(itensResultado);
	}
*/	
	@WebMethod(operationName="todosOsItens")
	@ResponseWrapper(localName="itens")
	@WebResult(name="item")
	public List<Item> getItens(){
		System.out.println("Chamado getItens()");
		return dao.todosItens();
	}
	
	
	
	@WebMethod(exclude=true)
	public void outroMetodo() {
		// nao vai fazer do WSDL.
	}
}
