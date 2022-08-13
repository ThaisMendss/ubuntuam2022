programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite um número inteiro positivo ")
		leia (numero)

		se(numero<0){
			escreva("Você digitou um numero negativo ")
		}
		se(numero==0){
			escreva("Você digitou zero, é um número neutro ")
		}
		senao se((numero%2)==0){
          	escreva("Você digitou um número par ")
          }
          senao{
          	escreva("Você digitou um numero impar ")
          }
          	
      
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */