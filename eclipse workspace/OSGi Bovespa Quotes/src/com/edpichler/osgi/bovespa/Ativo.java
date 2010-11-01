package com.edpichler.osgi.bovespa;

/** Ativo. Ex.: OGXP3, VALE5, PETR4 */
public class Ativo {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ativo [codigo=" + codigo + "; nome = " + nome + "]";
	}

	private String codigo, nome;

	
	public Ativo() {		
	}

	public void setCodigo(String code) {
		if (code == null) {
			this.codigo = null;
		} else {
			this.codigo = code.toUpperCase();
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
