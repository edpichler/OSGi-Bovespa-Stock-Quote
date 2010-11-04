package com.edpichler.osgi.bovespa.quote;

import java.util.List;

import com.edpichler.osgi.bovespa.quote.impl.Quote;


/**Classe para comunicação com a BMF Bovespa*/
public interface IBovespaQuoteRetriever {
	/**
	 * Retorna a cotação do ativo.
	 * @throws Exception 
	 * */
	public List<Quote> getQuotes(String[] codigoAtivo) throws Exception;
	public Quote getQuote(String codigoAtivo) throws Exception;
}
