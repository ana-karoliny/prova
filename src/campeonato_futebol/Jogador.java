package campeonato_futebol;

public class Jogador {
	private String nome;
	protected int idade;
	protected int habilidade;
	private int gols = 0;
	private int camisa;

	public Jogador(String nome, int idade, int habilidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.habilidade = habilidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHabilidade() {
		return habilidade;
	}

	public int getGols() {
		return gols;
	}

	public int getIdadte() {
		return idade;
	}

	public void somaGol() {
		this.gols++;
	}

}
