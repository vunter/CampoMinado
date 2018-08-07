package campoMinadoAPS;
import java.util.*;
public class JogoCampoMinadoAPS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha a dificuldade: Insira 1 para fácil (6x6), 2 para Médio (8x8) e 3 para Difícil(10x10)");
		CodJogoPrincipal jogar = new CodJogoPrincipal(in.nextInt());


	}

}
