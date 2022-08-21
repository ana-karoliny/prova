package campeonato_futebol;

public class JogadorDefesa extends Jogador {
	private int cobertura;
	private int desarme;

	public JogadorDefesa(String nome, int idade, int habilidade, int cobertura, int desarme) {
		super(nome, idade, habilidade);
		this.habilidade = habilidade;
		this.cobertura = cobertura;
		this.desarme = desarme;
	}

	public int getHabilidade() {
		return ((this.habilidade * 5) + (this.cobertura * 3) + (this.desarme * 2)) / 10;
	}

}
