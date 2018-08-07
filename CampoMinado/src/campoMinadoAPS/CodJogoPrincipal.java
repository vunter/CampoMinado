package campoMinadoAPS;

public class CodJogoPrincipal {
	private JogoDificil jogo;
	private JogoFacil jogoFacil;
	boolean terminar = false;
	boolean ganhou = false;
	int rodada = 0;

	public CodJogoPrincipal(int dificuldade) {
		if (dificuldade == 1) {
			jogoFacil = new JogoFacil();
			Jogar(jogoFacil);
		} else if (dificuldade == 2) {
			jogo = new JogoDificil();
			Jogar(jogo);
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
}
