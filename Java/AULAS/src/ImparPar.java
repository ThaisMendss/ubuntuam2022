import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um numero inteiro positivo: ");
		numero = leia.nextInt();
		
		if (numero < 0){
			System.out.print("O numero digitado foi negativo");
	}
		else if (numero== 0) {
			System.out.print("Você digitou zero, é um numero neutro");
	}
		else if ((numero % 2)== 0) {
			System.out.print("Você digitou um numero par");
	}
		else {
			System.out.print("Você digitou um numero impar");
		}
			
	}
		
}
