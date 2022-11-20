package ex2;

public abstract class LojaAbstract implements Registro {
	
	private String identificador;
	private String cnpj;
	private String razaoSocial;
	private boolean status;

	public LojaAbstract(String identificador, String cnpj, String razaoSocial) {
		this.identificador = identificador;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.status = false;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public boolean isstatus() {
		return status;
	}

	public void setstatus(boolean status) {
		this.status = status;
	}

	public String status() {
		String status;

		if (this.status == false) {
			status = "Fechada";
			return status;
		} else {
			status = "Aberta";
			return status;
		}
	}

	public String registra_abertura_dia() {
		if (status == true) {
			return "Acao negada, a loja ja esta aberta";
		} else {
			status = true;
			return "Loja foi aberta";
		}

	}

	public String registra_fechamento_dia() {
		if (status == false) {
			return "Acao negada, a loja já esta fechada";
		} else {
			status = false;
			return "Loja foi fechada";
		}

	}

	public String toString() {
		return identificador + " - Loja: " + status() + " - Razao Social: " + razaoSocial + " - CNPJ: " + cnpj;
	}

}
