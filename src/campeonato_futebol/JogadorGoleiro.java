package campeonato_futebol;

public class JogadorGoleiro extends Jogador {

	private int reflexo;
	private Float altura;

	public JogadorGoleiro(String nome, int idade, int habilidade, int reflexo, Float altura) {
		super(nome, idade, habilidade);
		this.habilidade = habilidade;
		this.reflexo = reflexo;
		this.altura = altura;

	}

	public int getHabilidade() {
		return ((this.habilidade * 5) + (((int) (this.altura * 100)) * 2) + (this.reflexo * 3)) / 10;
	}

}
