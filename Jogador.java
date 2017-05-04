package model;

public class Jogador {

	private String nomeDeUsuario;
	private String id;
	private String email;
	private int patente;
	private double kd;
	private int score;
	private int tempoJogo;
	private Classe classeFavorita;
	private Arma armaFavorita;
	private Veiculo veiculoFavorito;
	private String senha;
	
	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}
	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPatente() {
		return patente;
	}
	public void setPatente(int patente) {
		this.patente = patente;
	}
	public double getKd() {
		return kd;
	}
	public void setKd(double kd) {
		this.kd = kd;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getTempoJogo() {
		return tempoJogo;
	}
	public void setTempoJogo(int tempoJogo) {
		this.tempoJogo = tempoJogo;
	}
	public Classe getClasseFavorita() {
		return classeFavorita;
	}
	public void setClasseFavorita(Classe classeFavorita) {
		this.classeFavorita = classeFavorita;
	}
	public Arma getArmaFavorita() {
		return armaFavorita;
	}
	public void setArmaFavorita(Arma armaFavorita) {
		this.armaFavorita = armaFavorita;
	}
	public Veiculo getVeiculoFavorito() {
		return veiculoFavorito;
	}
	public void setVeiculoFavorito(Veiculo veiculoFavorito) {
		this.veiculoFavorito = veiculoFavorito;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
