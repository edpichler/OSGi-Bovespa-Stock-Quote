package com.edpichler.osgi.bovespa;

import java.util.List;


/**Classe para comunicação com a BMF Bovespa*/
public interface IBovespaQuoteRetriever {
	/**
	 * Retorna a cotação do ativo.
	 * @throws Exception 
	 * */
	public List<Quote> getQuotes(String[] codigoAtivo) throws Exception;
	public Quote getQuote(String codigoAtivo) throws Exception;
}
