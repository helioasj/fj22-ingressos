package br.com.caelum.ingresso.ingresso.descontos;

import java.math.BigDecimal;

public interface Desconto {
	
	BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal);
	String getDescricao();

}