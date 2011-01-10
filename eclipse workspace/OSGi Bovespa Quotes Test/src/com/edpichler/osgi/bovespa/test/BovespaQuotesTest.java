package com.edpichler.osgi.bovespa.test;

import java.util.List;

import junit.framework.TestCase;

import com.edpichler.osgi.bovespa.quote.BovespaProvider;
import com.edpichler.osgi.bovespa.quote.IBovespaQuoteRetriever;
import com.edpichler.osgi.bovespa.quote.IQuote;
import com.edpichler.osgi.bovespa.quote.impl.Quote;

public class BovespaQuotesTest extends TestCase {

	public void testGetQuote() throws Exception {
		IBovespaQuoteRetriever prov = BovespaProvider.createQuoteRetriever();
		Quote quote = prov.getQuote("OGXP3");
		double ultimo = quote.getUltimo();
		assertTrue(ultimo != 0);
	}

	public void testGetQuoteInvalid() throws Exception {
		IBovespaQuoteRetriever prov = BovespaProvider.createQuoteRetriever();
		Quote quote = prov.getQuote("xxxxx");
		assertNull(quote);
	}

	public void testGetQuoteList() throws Exception {
		IBovespaQuoteRetriever prov = BovespaProvider.createQuoteRetriever();
		List<IQuote> quotes = prov.getQuotes(new String[] { "OGXP3", "VALE5" });
		for (int i = 0; i < quotes.size(); i++) {
			double ultimo = quotes.get(i).getUltimo();
			assertTrue(ultimo != 0);
		}

	}
}
