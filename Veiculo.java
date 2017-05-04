package model;

public class Veiculo {

	private String tipo;
	private String nome;
	private boolean possuiArmamento = false;
	private String armaPrimaria = "";
	private String armaSecundaria = "";
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArmaPrimaria() {
		return armaPrimaria;
	}
	public void setArmaPrimaria(String armaPrimaria) {
		this.armaPrimaria = armaPrimaria;
	}
	public String getArmaSecundaria() {
		return armaSecundaria;
	}
	public void setArmaSecundaria(String armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}
	public boolean isPossuiArmamento() {
		return possuiArmamento;
	}
	public void setPossuiArmamento(boolean possuiArmamento) {
		this.possuiArmamento = possuiArmamento;
	}
	
}
