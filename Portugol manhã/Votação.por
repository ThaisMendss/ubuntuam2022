programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anoNascimento 
		inteiro idade

		escreva("Qual o seu nome? ")
		leia(nome)
		escreva("Qual o seu ano de nascimento? ")
		leia(anoNascimento)
		idade = 2022 - anoNascimento 
		
		se(idade<16){
		escreva(nome, " você tem " , idade, " anos de idade, ainda não pode votar")
		}
		senao se(idade<=17){
		escreva(nome, " você tem " , idade, " anos de idade, caso quiser já pode votar")
		}
          senao se(idade<=70){
          escreva(nome, " você tem " , idade, " anos de idade, a votação para você é obrigátoria")
		}
		senao{
		escreva(nome, " você tem " , idade , " anos de idade a votação para você não é obrigatória")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 684; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */