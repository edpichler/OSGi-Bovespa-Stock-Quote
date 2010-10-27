package com.edpichler.osgi.bovespa.pojo;

/** Ativo. Ex.: OGXP3, VALE5, PETR4 */
public class Ativo {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ativo [codigo=" + codigo + "]";
	}

	private String codigo;

	public Ativo(String code) {
		codigo = code;
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
}
