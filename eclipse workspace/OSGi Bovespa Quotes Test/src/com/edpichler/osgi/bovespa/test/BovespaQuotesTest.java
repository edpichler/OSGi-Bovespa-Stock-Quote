package com.edpichler.osgi.bovespa.test;

import java.util.List;

import junit.framework.TestCase;

import com.edpichler.osgi.bovespa.BovespaProvider;
import com.edpichler.osgi.bovespa.Cotacao;
import com.edpichler.osgi.bovespa.IBovespaQuoteRetriever;

public class BovespaQuotesTest extends TestCase {

	public void testGetQuote() throws Exception {
		IBovespaQuoteRetriever prov = BovespaProvider.createQuoteRetriever();
		Cotacao quote = prov.getQuote("OGXP3");
		double ultimo = quote.getUltimo();
		assertTrue(ultimo != 0);
	}

	public void testGetQuoteInvalid() throws Exception {
		IBovespaQuoteRetriever prov = BovespaProvider.createQuoteRetriever();
		Cotacao quote = prov.getQuote("xxxxx");
		assertNull(quote);
	}

	public void testGetQuoteList() throws Exception {
		IBovespaQuoteRetriever prov = BovespaProvider.createQuoteRetriever();
		List<Cotacao> quotes = prov.getQuotes(new String[] { "OGXP3", "VALE5" });
		for (int i = 0; i < quotes.size(); i++) {
			double ultimo = quotes.get(i).getUltimo();
			assertTrue(ultimo != 0);
		}

	}
	public static void main(String[] args) {
		IBovespaQuoteRetriever prov = BovespaProvider.createQuoteRetriever();
		Cotacao quote = prov.getQuote("OGXP3");
		double ultimo = quote.getUltimo();
		
		System.out.println(quote);
		
	}

}
