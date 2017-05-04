package model;

public class Arma {
	
	private String nome;
	private String tipo;
	private boolean acessorio= false;
	private int dano;
	private int alcance;
	private int precisao;
	private int tiroSemVisada;
	private int estabilidade;
	private int cadencia;
	private int capacidadeDoPente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isAcessorio() {
		return acessorio;
	}
	public void setAcessorio(boolean acessorio) {
		this.acessorio = acessorio;
	}
	public int getDano() {
		return dano;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public int getAlcance() {
		return alcance;
	}
	public void setAlcance(int alcance) {
		this.alcance = alcance;
	}
	public int getPrecisao() {
		return precisao;
	}
	public void setPrecisao(int precisao) {
		this.precisao = precisao;
	}
	public int getTiroSemVisada() {
		return tiroSemVisada;
	}
	public void setTiroSemVisada(int tiroSemVisada) {
		this.tiroSemVisada = tiroSemVisada;
	}
	public int getEstabilidade() {
		return estabilidade;
	}
	public void setEstabilidade(int estabilidade) {
		this.estabilidade = estabilidade;
	}
	public int getCadencia() {
		return cadencia;
	}
	public void setCadencia(int cadencia) {
		this.cadencia = cadencia;
	}
	public int getCapacidadeDoPente() {
		return capacidadeDoPente;
	}
	public void setCapacidadeDoPente(int capacidadeDoPente) {
		this.capacidadeDoPente = capacidadeDoPente;
	}
	
}
