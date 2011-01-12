package com.edpichler.osgi.bovespa.quote.impl;

import java.util.Date;

import com.edpichler.osgi.bovespa.quote.IQuote;

public class Quote implements IQuote {

	private Date data;
	private double abertura, minimo, maximo, medio, ultimo, oscilacao;
	private String nome, codigo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#getNome()
	 */
	@Override
	public String getNome() {
		return nome;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#setNome(java.lang.String)
	 */
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#getCodigo()
	 */
	@Override
	public String getCodigo() {
		return codigo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#setCodigo(java.lang.String)
	 */
	@Override
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#getData()
	 */
	@Override
	public Date getData() {
		return data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#setData(java.util.Date)
	 */
	@Override
	public void setData(Date data) {
		this.data = data;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#getAbertura()
	 */
	@Override
	public double getAbertura() {
		return abertura;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#setAbertura(double)
	 */
	@Override
	public void setAbertura(double abertura) {
		this.abertura = abertura;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#getMinimo()
	 */
	@Override
	public double getMinimo() {
		return minimo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#setMinimo(double)
	 */
	@Override
	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#getMaximo()
	 */
	@Override
	public double getMaximo() {
		return maximo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#setMaximo(double)
	 */
	@Override
	public void setMaximo(double maximo) {
		this.maximo = maximo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#getMedio()
	 */
	@Override
	public double getMedio() {
		return medio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#setMedio(double)
	 */
	@Override
	public void setMedio(double medio) {
		this.medio = medio;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#getUltimo()
	 */
	@Override
	public double getUltimo() {
		return ultimo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#setUltimo(double)
	 */
	@Override
	public void setUltimo(double ultimo) {
		this.ultimo = ultimo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#getOscilacao()
	 */
	@Override
	public double getOscilacao() {
		return oscilacao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.edpichler.osgi.bovespa.IQuote#setOscilacao(double)
	 */
	@Override
	public void setOscilacao(double oscilacao) {
		this.oscilacao = oscilacao;
	}

	@Override
	public String toString() {
		return "Quote [data=" + data + ", abertura=" + abertura + ", minimo="
				+ minimo + ", maximo=" + maximo + ", medio=" + medio
				+ ", ultimo=" + ultimo + ", oscilacao=" + oscilacao + ", nome="
				+ nome + ", codigo=" + codigo + "]";
	}

}
