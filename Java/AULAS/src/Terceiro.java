import java.util.Scanner;

public class Terceiro {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroInteiro = 0;
		double numeroReal = 0.0;
		char caracter = ' ';
		String cadeiaCaracter = "";
		
		System.out.print("Digite um numero Inteiro: ");
		numeroInteiro = leia.nextInt();
		System.out.print("Digite um numero Real: ");
		numeroReal = leia.nextDouble();
		System.out.print("Digite um caracter: ");
		caracter = leia.next().charAt(0);
		System.out.print("Digite uma String: ");
		cadeiaCaracter = leia.next();
		
		System.out.println("O numero Inteiro digitado foi: "+ numeroInteiro);
		System.out.println("O numero Real digitado foi: "+ numeroReal);
		System.out.println("O caracter digitado foi: "+ caracter);
		System.out.println("A Sttring dgitada foi: "+ cadeiaCaracter);
		
		
		
		
		
		
		
		}
}
