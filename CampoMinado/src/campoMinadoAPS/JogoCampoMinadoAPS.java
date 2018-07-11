package campoMinadoAPS;
import java.util.*;
public class JogoCampoMinadoAPS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha a dificuldade: Insira 1 para fácil (6x6) e 2 para difícil (8x8)");
		CodJogoPrincipal jogar = new CodJogoPrincipal(in.nextInt());


	}

}
