package campoMinadoAPS;

import java.util.Random;
import java.util.Scanner;

public class JogoDificil {
	private int[][] minas;
	private char[][] tabuleiro;
	private int linha, coluna;
	Random random = new Random();
	Scanner in = new Scanner(System.in);

	public JogoDificil() {
		minas = new int[12][12];
		tabuleiro = new char[12][12];
		minas();
		insereMinas();
		preencheDicas();
		startBoard();

	}

	public boolean ganhou() {
		int count = 0;
		for (int line = 1; line < 11; line++)
			for (int column = 1; column < 11; column++)
				if (tabuleiro[line][column] == '~')
					count++;
		if (count == 12)
			return true;
		else
			return false;
	}

	public void abrirProximas() {
		for (int i = -1; i < 2; i++)
			for (int j = -1; j < 2; j++)
				if ((minas[linha + i][coluna + j] != -1)
						&& (linha != 0 && linha != 11 && coluna != 0 && coluna != 11)) {
					tabuleiro[linha + i][coluna + j] = Character.forDigit(minas[linha + i][coluna + j], 12);
				}
	}

	public int getPosicao(int linha, int coluna) {
		return minas[linha][coluna];
	}

	public boolean setPosicao() {

		do {
			System.out.print("\nLinha: ");
			linha = in.nextInt();
			System.out.print("Coluna: ");
			coluna = in.nextInt();

			if ((linha < 11 && linha > 0) && (coluna < 11 && coluna > 0)) {
				if (tabuleiro[linha][coluna] != '~') {
					System.out.println("Esse campo já está sendo exibido!");
				}
			}
			if (linha < 1 || linha > 10 || coluna < 1 || coluna > 10) {
				System.out.println("\n\nEscolha números de 1 até 10");
				linha = 11;
				coluna = 11;
				tabuleiro[linha][coluna] = 50;
				exibe();
			}

		} while ((tabuleiro[linha][coluna] != '~'));

		if (getPosicao(linha, coluna) == -1)
			return true;
		else
			return false;

	}

	public void exibe() {
		System.out.println("\n     Linhas");
		for (int linha = 10; linha > 0; linha--) {
			if (linha != 10) {
				System.out.print("        " + linha + " ");
			} else {
				System.out.print("       " + linha + " ");
			}
			for (int coluna = 1; coluna < 11; coluna++) {
				System.out.print("  " + tabuleiro[linha][coluna]);
			}

			System.out.println();
		}

		System.out.println("\n            1  2  3  4  5  6  7  8  9  10");
		System.out.println("                 Colunas");

	}

	public void preencheDicas() {
		for (int line = 1; line < 11; line++)
			for (int column = 1; column < 11; column++) {

				for (int i = -1; i <= 1; i++)
					for (int j = -1; j <= 1; j++)
						if (minas[line][column] != -1)
							if (minas[line + i][column + j] == -1)
								minas[line][column]++;

			}

	}

	public void exibeMinas() {
		for (int i = 1; i < 11; i++)
			for (int j = 1; j < 11; j++)
				if (minas[i][j] == -1)
					tabuleiro[i][j] = '*';

		exibe();
	}

	public void startBoard() {
		for (int i = 1; i < tabuleiro.length; i++)
			for (int j = 1; j < tabuleiro.length; j++)
				tabuleiro[i][j] = '~';
	}

	public void minas() {
		for (int i = 0; i < minas.length; i++)
			for (int j = 0; j < minas.length; j++)
				minas[i][j] = 0;
	}

	public void insereMinas() {
		boolean sorteado;
		int linha, coluna;
		for (int i = 0; i < 30; i++) {

			do {
				linha = random.nextInt(10) + 1;
				coluna = random.nextInt(10) + 1;

				if (minas[linha][coluna] == -1)
					sorteado = true;
				else
					sorteado = false;
			} while (sorteado);

			minas[linha][coluna] = -1;
		}
	}
}
