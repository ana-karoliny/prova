package campeonato_futebol;

import java.util.Date;

public class Partida {
	private Date data;
	private Time timeCasa;
	private Time timeVisitante;
	private int placarCasa = 0;
	private int placarVisitante = 0;

	public Partida(Date data, Time pCasa, Time pVisi) {
		super();
		this.data = data;
		this.timeCasa = pCasa;
		this.timeVisitante = pVisi;
	}

	public void golCasa() {
		this.placarCasa++;

	}

	public void golVisitante() {
		this.placarVisitante++;

	}

	public String getPlacar() {
		return timeCasa.getNome() + " " +  placarCasa + " X "  + " " + placarVisitante + timeVisitante.getNome();

	}

}
