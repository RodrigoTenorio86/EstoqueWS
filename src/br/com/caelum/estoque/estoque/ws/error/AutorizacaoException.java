package br.com.caelum.estoque.estoque.ws.error;

import java.util.Date;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizacaoFault", messageName="AutorizacaoFault")
public class AutorizacaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AutorizacaoException(String mensagem) {
		// TODO Auto-generated constructor stub
		super(mensagem);
	}
/**
	public String getFaultInfo() {
		return "Token Invalido!!!, ";
	}
	*/
	public InfoFault getFaultInfo() {
		return new InfoFault("Token Invalido!!!", new Date());
	}
}
