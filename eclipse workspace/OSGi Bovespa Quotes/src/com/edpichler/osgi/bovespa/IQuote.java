package com.edpichler.osgi.bovespa;

import java.util.Date;

public interface IQuote {

	/** Ex. Petrobrás */
	public abstract String getNome();

	public abstract void setNome(String nome);

	/** Ex.: PETR3 */
	public abstract String getCodigo();

	public abstract void setCodigo(String codigo);

	/**
	 * 
	 * @return a data da cotação do ativo. Horário de Brasília GMT -3.
	 */
	public abstract Date getData();

	/**
	 * @param data
	 *            the data to set
	 */
	public abstract void setData(Date data);

	/**
	 * @return the abertura
	 */
	public abstract double getAbertura();

	/**
	 * @param abertura
	 *            the abertura to set
	 */
	public abstract void setAbertura(double abertura);

	/**
	 * @return the minimo
	 */
	public abstract double getMinimo();

	/**
	 * @param minimo
	 *            the minimo to set
	 */
	public abstract void setMinimo(double minimo);

	/**
	 * @return the maximo
	 */
	public abstract double getMaximo();

	/**
	 * @param maximo
	 *            the maximo to set
	 */
	public abstract void setMaximo(double maximo);

	/**
	 * @return the medio
	 */
	public abstract double getMedio();

	/**
	 * @param medio
	 *            the medio to set
	 */
	public abstract void setMedio(double medio);

	/**
	 * @return the ultimo
	 */
	public abstract double getUltimo();

	/**
	 * @param ultimo
	 *            the ultimo to set
	 */
	public abstract void setUltimo(double ultimo);

	/**
	 * @return the oscilacao
	 */
	public abstract double getOscilacao();

	/**
	 * @param oscilacao
	 *            the oscilacao to set
	 */
	public abstract void setOscilacao(double oscilacao);

}