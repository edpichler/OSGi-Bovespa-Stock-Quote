package com.edpichler.osgi.bovespa;

import java.util.Date;

public class Quote {

	private Date data;
	private double abertura, minimo, maximo, medio, ultimo, oscilacao;
	private String nome, codigo;

	/** Ex. Petrobrás */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/** Ex.: PETR3 */
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return a data da cotação do ativo. Horário de Brasília GMT -3.
	 */
	public Date getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * @return the abertura
	 */
	public double getAbertura() {
		return abertura;
	}

	/**
	 * @param abertura
	 *            the abertura to set
	 */
	public void setAbertura(double abertura) {
		this.abertura = abertura;
	}

	/**
	 * @return the minimo
	 */
	public double getMinimo() {
		return minimo;
	}

	/**
	 * @param minimo
	 *            the minimo to set
	 */
	public void setMinimo(double minimo) {
		this.minimo = minimo;
	}

	/**
	 * @return the maximo
	 */
	public double getMaximo() {
		return maximo;
	}

	/**
	 * @param maximo
	 *            the maximo to set
	 */
	public void setMaximo(double maximo) {
		this.maximo = maximo;
	}

	/**
	 * @return the medio
	 */
	public double getMedio() {
		return medio;
	}

	/**
	 * @param medio
	 *            the medio to set
	 */
	public void setMedio(double medio) {
		this.medio = medio;
	}

	/**
	 * @return the ultimo
	 */
	public double getUltimo() {
		return ultimo;
	}

	/**
	 * @param ultimo
	 *            the ultimo to set
	 */
	public void setUltimo(double ultimo) {
		this.ultimo = ultimo;
	}

	/**
	 * @return the oscilacao
	 */
	public double getOscilacao() {
		return oscilacao;
	}

	/**
	 * @param oscilacao
	 *            the oscilacao to set
	 */
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
