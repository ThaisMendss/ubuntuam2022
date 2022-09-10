import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String times[] = new String [4];
		int pontos[] = new int[4];
		char auxpontos=' ';
		
		times[0]= "São Paulo";
		times[1]= "Palmeiras";
		times[2]= "Corinthians";
		times[3]= "Santos";
		
		for (int x=1; x<=3; x++){
			System.out.println("Rodada: "+x);
		for (int i=0; i<4; i++) {
			System.out.print(times[i]);
			System.out.println(" Ganhou, empatou ou perdeu? Digite [G, E ou P] referente a está rodada: ");
			auxpontos = leia.next().charAt(0);
		if(auxpontos== 'G' || auxpontos== 'g') {
			pontos[i]=pontos[i]+3;
		}
		else if (auxpontos== 'E' || auxpontos=='e') {
			pontos[i]=pontos[i]+1;
		}
		else {
			pontos[i]=pontos[i]+0;
		}
		
	}
		
}
		for (int i=0; i<4; i++) {
			System.out.println(times[i]+" = "+ pontos[i]);
		}
		
	}

}


