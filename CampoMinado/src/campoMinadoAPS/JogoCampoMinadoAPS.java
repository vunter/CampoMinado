package campoMinadoAPS;
import java.util.*;
public class JogoCampoMinadoAPS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escolha a dificuldade: Insira 1 para f�cil (6x6), 2 para M�dio (8x8) e 3 para Dif�cil(10x10)");
		CodJogoPrincipal jogar = new CodJogoPrincipal(in.nextInt());


	}

}
