package campoMinadoAPS;

public class CodJogoPrincipal {
	private JogoDificil jogoDificil;
	private JogoFacil jogoFacil;
	private JogoMedio jogoMedio;
	boolean terminar = false;
	boolean ganhou = false;
	int rodada = 0;

	public CodJogoPrincipal(int dificuldade) {
		if (dificuldade == 1) {
			jogoFacil = new JogoFacil();
			Jogar(jogoFacil);
		} else if (dificuldade == 2) {
			jogoMedio = new JogoMedio();
			Jogar(jogoMedio);
		} else if (dificuldade == 3) {
			jogoDificil = new JogoDificil();
			Jogar(jogoDificil);
		}
		
	}


	public void Jogar(JogoFacil jogo) {
		do {
			rodada++;
			System.out.println("Rodada " + rodada);
			jogo.exibe();
			terminar = jogo.setPosicao();

			if (!terminar) {
				jogo.abrirProximas();
				terminar = jogo.ganhou();
			}

		} while (!terminar);

		if (!jogo.ganhou()) {
			System.out.println("BUUUM! Você perdeu!");
			jogo.exibeMinas();
		} else {
			System.out.println("Parabéns, você deixou os 8 campos de minas livres em " + rodada + " rodadas");

			jogo.exibeMinas();
		}
	}
	public void Jogar(JogoMedio jogo) {
		do {
			rodada++;
			System.out.println("Rodada " + rodada);
			jogo.exibe();
			terminar = jogo.setPosicao();

			if (!terminar) {
				jogo.abrirProximas();
				terminar = jogo.ganhou();
			}

		} while (!terminar);

		if (!jogo.ganhou()) {
			System.out.println("BUUUM! Você perdeu!");
			jogo.exibeMinas();
		} else {
			System.out.println("Parabéns, você deixou os 20 campos de minas livres em " + rodada + " rodadas");

			jogo.exibeMinas();
		}
	}
	public void Jogar(JogoDificil jogo) {
		do {
			rodada++;
			System.out.println("Rodada " + rodada);
			jogo.exibe();
			terminar = jogo.setPosicao();

			if (!terminar) {
				jogo.abrirProximas();
				terminar = jogo.ganhou();
			}

		} while (!terminar);

		if (!jogo.ganhou()) {
			System.out.println("BUUUM! Você perdeu!");
			jogo.exibeMinas();
		} else {
			System.out.println("Parabéns, você deixou os 20 campos de minas livres em " + rodada + " rodadas");

			jogo.exibeMinas();
		}
	}
}
