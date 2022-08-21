package campeonato_futebol;

import java.text.DateFormat;
import java.util.Date;

public class Main {

	public static void main(String args[]) {
		
		Date data = new Date();
		DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);

		Time time1 = new Time("Argentina");

		Jogador jogGol = new JogadorGoleiro("Julio Cesar", 23, 12, 123, 1.90F);
		Jogador jogAtac1 = new JogadorAtacante("Neymar", 35, 9, 10, 160);
		Jogador jogAtac2 = new JogadorAtacante("Gabriel Jesus", 12, 26, 13, 65);
		Jogador jogDef1 = new JogadorDefesa("Thiago Silva", 30, 25, 34, 89);
		Jogador jogDef2 = new JogadorDefesa("Pelé", 87, 12, 23, 89);

		Time time2 = new Time("Portugal");

		Jogador jogGol2 = new JogadorGoleiro("Alvaro", 23, 12, 123, 1.90F);
		Jogador jogAtac3 = new JogadorAtacante("José", 35, 9, 10, 160);
		Jogador jogAtac4 = new JogadorAtacante("Francico", 12, 26, 13, 65);
		Jogador jogDef3 = new JogadorDefesa("Marcos", 30, 25, 34, 89);
		Jogador jogDef4 = new JogadorDefesa("Moises", 87, 12, 23, 89);

		Partida part = new Partida(data, time1, time2);

		part.golVisitante();
		jogGol2.somaGol();
		part.golVisitante();
		jogAtac3.somaGol();

		time2.somaVitoria();
		time1.somaDerrota();

		Partida part2 = new Partida(data, time1, time2);
		part2.golCasa();
		jogAtac1.somaGol();
		part2.golCasa();
		jogAtac1.somaGol();
		part2.golVisitante();
		jogDef4.somaGol();
		part2.golVisitante();
		jogAtac3.somaGol();
		part2.golVisitante();
		jogDef4.somaGol();

		time2.somaVitoria();
		time1.somaDerrota();

		System.out.println("Jogadores do time 1");
		time1.insJogador(jogGol);
		time1.imprimeJogador();
		time1.insJogador(jogAtac1);
		time1.imprimeJogador();
		time1.insJogador(jogAtac2);
		time1.imprimeJogador();
		time1.insJogador(jogDef1);
		time1.imprimeJogador();
		time1.insJogador(jogDef2);
		time1.imprimeJogador();
		
		System.out.println("--------------------------------------");
		
		System.out.println("Jogadores do time 2");
		time2.insJogador(jogGol2);
		time2.imprimeJogador();
		time2.insJogador(jogAtac4);
		time2.imprimeJogador();
		time2.insJogador(jogAtac3);
		time2.imprimeJogador();
		time2.insJogador(jogDef3);
		time2.imprimeJogador();
		time2.insJogador(jogDef4);
		time2.imprimeJogador();
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("PLACAR PARTIDA 1 " + part.getPlacar() + " Dia " + dfs.format(data));
		System.out.println("PLACAR PARTIDA 2 " + part2.getPlacar() + " Dia " + dfs.format(data));
		
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("RESULTADO FINAL " + time1.getNome() + " " + time1.getresultado());
		System.out.println("RESULTADO FINAL " + time2.getNome() + " " + time2.getresultado());

	}
}
