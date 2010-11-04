<<<<<<< HEAD:eclipse workspace/OSGi Bovespa Quotes/src/com/edpichler/osgi/bovespa/quote/BovespaProvider.java
package com.edpichler.osgi.bovespa.quote;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

import com.edpichler.osgi.bovespa.quote.impl.Quote;

/**
 * Classe que retorna um objeto para comunicação com os servidores da Bovespa.
 * 
 * */
public class BovespaProvider implements IBovespaQuoteRetriever {
	private final static String BOVESPA_QUOTE_URL = "http://www.bmfbovespa.com.br/Pregao-Online/ExecutaAcaoAjax.asp";

	public static IBovespaQuoteRetriever createQuoteRetriever() {
		return new BovespaProvider();
	}

	@Override
	public List<IQuote> getQuotes(String[] codigoAtivo) throws Exception {
		List<IQuote> lista = new ArrayList<IQuote>();
		for (int i = 0; i < codigoAtivo.length; i++) {
			IQuote quote = getQuote(codigoAtivo[i]);
			lista.add(quote);
		}
		return lista;
	}

	public IQuote getQuote(String codigoAtivo) throws Exception {
		String quoteUrlRequest = BOVESPA_QUOTE_URL + "?CodigoPapel="
				+ codigoAtivo;

		URL feedUrl;
		SAXBuilder builder = new SAXBuilder();
		Document doc;

		try {
			feedUrl = new URL(quoteUrlRequest);
			doc = builder.build(feedUrl);

			// parse
			List<Element> elements = doc.getRootElement().getChildren("Papel");
			if (elements.size() > 0) {
				Element papel = elements.get(0);

				// <Papel Codigo="OGXP3" Nome="OGX PETROLEO ON NM"
				// Ibovespa="#" Data="27/10/2010 13:24:47" Abertura="21,95"
				// Minimo="21,65"
				// Maximo="21,95" Medio="21,76" Ultimo="21,73" Oscilacao="-1,18"
				String ultimo = papel.getAttribute("Ultimo").getValue();
				String oscilacao = papel.getAttribute("Oscilacao").getValue();
				String medio = papel.getAttribute("Medio").getValue();
				String maximo = papel.getAttribute("Maximo").getValue();
				String minimo = papel.getAttribute("Minimo").getValue();
				String abertura = papel.getAttribute("Abertura").getValue();
				String data = papel.getAttribute("Data").getValue();
				String nome = papel.getAttribute("Nome").getValue();
				String codigo = papel.getAttribute("Codigo").getValue();

				IQuote cot = createCotacao(ultimo, oscilacao, medio, maximo,
						minimo, abertura, data, nome, codigo);

				return cot;
			} else {
				return null;
			}
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Cria um objeto cotação a partir dos parametros
	 * 
	 * @throws ParseException
	 * */
	private IQuote createCotacao(String ultimo, String oscilacao, String medio,
			String maximo, String minimo, String abertura, String data,
			String nome, String codigo) throws ParseException {

		Quote cot = new Quote();
		// Data="27/10/2010 13:24:47"
		Date _dt = getData(data);
		cot.setCodigo(codigo);
		cot.setNome(nome);
		cot.setData(_dt);
		cot.setAbertura(Double.parseDouble(abertura.replace(",", ".")));
		cot.setMaximo(Double.parseDouble(maximo.replace(",", ".")));
		cot.setMinimo(Double.parseDouble(minimo.replace(",", ".")));
		cot.setMedio(Double.parseDouble(medio.replace(",", ".")));
		cot.setOscilacao(Double.parseDouble(oscilacao.replace(",", ".")));
		cot.setUltimo(Double.parseDouble(ultimo.replace(",", ".")));

		return cot;
	}

	private Date getData(String data) throws ParseException {

		String pattern = null;
		if (data.contains(" ")) {
			pattern = "dd/MM/yyyy HH:mm:ss";
		} else {
			pattern = "dd/MM/yyyyHH:mm:ss";
		}

		Date retorno = new SimpleDateFormat(pattern).parse(data);
		return retorno;

	}
=======
package com.edpichler.osgi.bovespa;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

/**
 * Classe que retorna um objeto para comunicação com os servidores da Bovespa.
 * 
 * */
public class BovespaProvider implements IBovespaQuoteRetriever {
	private final static String BOVESPA_QUOTE_URL = "http://www.bmfbovespa.com.br/Pregao-Online/ExecutaAcaoAjax.asp";

	public static IBovespaQuoteRetriever createQuoteRetriever() {
		return new BovespaProvider();
	}

	@Override
	public List<Cotacao> getQuotes(String[] codigoAtivo) throws Exception {
		List<Cotacao> lista = new ArrayList<Cotacao>();
		for (int i = 0; i < codigoAtivo.length; i++) {
			Cotacao quote = getQuote(codigoAtivo[i]);
			lista.add(quote);
		}
		return lista;
	}

	public Cotacao getQuote(String codigoAtivo) throws Exception {
		String quoteUrlRequest = BOVESPA_QUOTE_URL + "?CodigoPapel="
				+ codigoAtivo;

		URL feedUrl;
		SAXBuilder builder = new SAXBuilder();
		Document doc;

		try {
			feedUrl = new URL(quoteUrlRequest);
			doc = builder.build(feedUrl);

			// parse
			List<Element> elements = doc.getRootElement().getChildren("Papel");
			if (elements.size() > 0) {
				Element papel = elements.get(0);

				// <Papel Codigo="OGXP3" Nome="OGX PETROLEO ON NM"
				// Ibovespa="#" Data="27/10/2010 13:24:47" Abertura="21,95"
				// Minimo="21,65"
				// Maximo="21,95" Medio="21,76" Ultimo="21,73" Oscilacao="-1,18"
				String ultimo = papel.getAttribute("Ultimo").getValue();
				String oscilacao = papel.getAttribute("Oscilacao").getValue();
				String medio = papel.getAttribute("Medio").getValue();
				String maximo = papel.getAttribute("Maximo").getValue();
				String minimo = papel.getAttribute("Minimo").getValue();
				String abertura = papel.getAttribute("Abertura").getValue();
				String data = papel.getAttribute("Data").getValue();
				String nome = papel.getAttribute("Nome").getValue();
				String codigo = papel.getAttribute("Codigo").getValue();

				Cotacao cot = createCotacao(ultimo, oscilacao, medio, maximo,
						minimo, abertura, data, nome, codigo);

				return cot;
			} else {
				return null;
			}
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Cria um objeto cotação a partir dos parametros
	 * 
	 * @throws ParseException
	 * */
	private Cotacao createCotacao(String ultimo, String oscilacao,
			String medio, String maximo, String minimo, String abertura,
			String data, String nome, String codigo) throws ParseException {

		Cotacao cot = new Cotacao();
		// Data="27/10/2010 13:24:47" e com hora zerada vem assim
		// "29/10/201000:00:00"
		String padrao = getPattern(data);
		Date _dt = new SimpleDateFormat(padrao).parse(data);

		cot.setData(_dt);
		cot.setAbertura(getDouble(abertura));
		cot.setMaximo(getDouble(maximo.replace(",", ".")));
		cot.setMinimo(getDouble(minimo.replace(",", ".")));
		cot.setMedio(getDouble(medio.replace(",", ".")));
		cot.setOscilacao(getDouble(oscilacao.replace(",", ".")));
		cot.setUltimo(getDouble(ultimo.replace(",", ".")));
		cot.setCodigo(codigo);
		cot.setNome(nome);

		if (cot.getUltimo() == 0) {
			return null;
		}
		return cot;
	}

	private double getDouble(String valor) {
		valor = valor.replaceAll(",", ".");
		if (valor.length() == 0) {
			return 0;
		}
		return Double.parseDouble(valor);
	}

	private String getPattern(String example) {
		if (example.contains(" ")) {
			return "dd/MM/yyyy" + " " + "HH:mm:ss";
		} else {
			return "dd/MM/yyyyHH:mm:ss";
		}

	}
>>>>>>> 3fb9d0f27df73f1768817ecd77f031655376867c:eclipse workspace/OSGi Bovespa Quotes/src/com/edpichler/osgi/bovespa/BovespaProvider.java
}