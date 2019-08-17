package br.com.caelum.estoque.estoque.ws.error;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class InfoFault {
	private Date dataErro;
	private String mensagem;

	public InfoFault( String mensagem,Date dataErro) {
		this.dataErro = dataErro;
		this.mensagem = mensagem;
	}

	InfoFault() {
	}

}
