package campoMinadoAPS;
import java.util.*;
public class JogoCampoMinadoAPS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha a dificuldade: Insira 1 para f�cil (6x6) e 2 para dif�cil (8x8)");
		CodJogoPrincipal jogar = new CodJogoPrincipal(in.nextInt());


	}

}
