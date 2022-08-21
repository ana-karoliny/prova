package campeonato_futebol;

public class JogadorAtacante extends Jogador {

	private int velocidade;
	private int tecnica;

	public JogadorAtacante(String nome, int idade, int habilidade, int velocidade, int tecnica) {
		super(nome, idade, habilidade);
		this.habilidade = habilidade;
		this.velocidade = velocidade;
		this.tecnica = tecnica;

	}

	public int getHabilidade() {
		return ((this.habilidade * 5) + (this.velocidade * 2) + (this.tecnica * 3)) / 10;
	}

}
