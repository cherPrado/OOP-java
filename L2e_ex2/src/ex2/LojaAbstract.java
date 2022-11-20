package ex2;

public class LojaAbstract {
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

		if (this.status == false) 
		{
			status = "Fechado";
			return status;
		} else {
			status = "Aberto";
			return status;
		}
	}

	public String toString() {
		return identificador + " - Razão Social: " + razaoSocial + " - CNPJ: " + cnpj + " - Status da loja: "
				+ status();
	}

}
