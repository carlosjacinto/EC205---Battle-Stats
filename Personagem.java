package model;

public class Personagem {
	
	private String nome;
	private Classe classe;
	private Arma armaPrimaria;
	private Arma armaSecundaria;
	private Arma itemUm;
	private Arma itemDois;
	
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Arma getArmaPrimaria() {
		return armaPrimaria;
	}
	public void setArmaPrimaria(Arma armaPrimaria) {
		this.armaPrimaria = armaPrimaria;
	}
	public Arma getArmaSecundaria() {
		return armaSecundaria;
	}
	public void setArmaSecundaria(Arma armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}
	public Arma getItemUm() {
		return itemUm;
	}
	public void setItemUm(Arma itemUm) {
		this.itemUm = itemUm;
	}
	public Arma getItemDois() {
		return itemDois;
	}
	public void setItemDois(Arma itemDois) {
		this.itemDois = itemDois;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
