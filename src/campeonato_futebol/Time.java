package campeonato_futebol;

public class Time {
	private String nome;
	private Jogador jogador;
	private int vitoria = 0;
	private int empate = 0;
	private int derrota = 0;

	public Time(String nome) {
		super();
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void somaVitoria() {
		this.vitoria++;
	}

	public void somaDerrota() {
		this.derrota++;
	}

	public void somaEmpate() {
		this.empate++;
	}

	public String getresultado() {
		return "Vitoria " + vitoria + " Derrota " + derrota + " Empate " + empate;

	}

	public void insJogador(Jogador pJog) {
		jogador = pJog;

	}

	public void imprimeJogador() {

		System.out.println(
				"NOME:" + jogador.getNome() + " - GOLS " + jogador.getGols() + " - idade " + jogador.getIdadte());

	}

	@Override
	public String toString() {
		return this.nome + this.jogador + this.derrota + this.empate + this.vitoria;
	}

}
