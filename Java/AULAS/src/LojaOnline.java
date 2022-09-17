import java.util.Scanner;

public class LojaOnline {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String produto[] = {"MADEIRA", "TIJOLO", "PEDRA", "CIMENTO", "PORTA", "VIGA", "TELHA", "BLOCO", "AREIA", "FERRO"};
		String codigos[] = {"GRP3-1", "GRP3-2", "GRP3-3", "GRP3-4", "GRP3-5", "GRP3-6", "GRP3-7", "GRP3-8", "GRP3-9", "GRP3-10"};							
		int estoque[] = new int [10];					
		int carrinho[] = new int [10];					
		double valor[] = {30.00, 5.00, 50.00, 40.00, 150.00, 200.00, 80.00, 20.00, 40.00, 70.00};		
		char caracter = ' ';
		boolean fazerCompra = false;
		
		
		
		System.out.println("Casa&Casa");
		System.out.println("Construa com a gente");
		

		
		do{
			
			System.out.print("Deseja fazer compras? (digite S ou N): ");
			
			caracter = leia.next().charAt(0);
			
			if (caracter=='S'|| caracter=='s'){
				System.out.println("VAMOS COMPRAR!");
				fazerCompra = false;
			}
			else if(caracter=='N'|| caracter=='n') {
				System.out.println("Até breve...");
				fazerCompra = false;
			}
			else {
				System.out.println("S ou N, por favor digite novamente");
				fazerCompra = true;
			}
		
		}
		while (fazerCompra);		
			
	}

}
