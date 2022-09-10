import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int contador = 0, numeroEscolhido = 0, total = 0;
		System.out.print("Escolha um numero ");
		numeroEscolhido = leia.nextInt();
		
		do {
			contador++;
			System.out.print(contador);
			if (contador<numeroEscolhido) {
				System.out.print(" + ");
			}
				
			total+=contador;
		}
				
		while(contador<numeroEscolhido);
			System.out.print(" = "+total);
	}
}

	


