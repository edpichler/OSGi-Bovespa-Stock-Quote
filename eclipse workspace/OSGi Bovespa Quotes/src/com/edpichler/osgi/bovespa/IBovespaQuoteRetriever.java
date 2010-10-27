package com.edpichler.osgi.bovespa;

import java.util.List;

import com.edpichler.osgi.bovespa.pojo.Cotacao;

/**Classe para comunica��o com a BMF Bovespa*/
public interface IBovespaQuoteRetriever {
	/**
	 * Retorna a cota��o do ativo.
	 * @throws Exception 
	 * */
	public List<Cotacao> getQuotes(String[] codigoAtivo) throws Exception;
	public Cotacao getQuote(String codigoAtivo) throws Exception;
}
