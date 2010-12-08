package com.edpichler.osgi.bovespa.quote;

import java.util.List;

/** Classe para comunicaçãoo com a BMF Bovespa */
public interface IBovespaQuoteRetriever {
	/**
	 * Retorna a cotação do ativo.
	 * 
	 * @throws Exception
	 * */
	public List<IQuote> getQuotes(String[] codigoAtivo) throws Exception;

	public IQuote getQuote(String codigoAtivo) throws Exception;
}
