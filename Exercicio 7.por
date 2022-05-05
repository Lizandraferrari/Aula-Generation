programa
{
	
	funcao inicio()
	{
	//*
	/*	
	 * 	7) Receber valores de base e altura de um triângulo e verificar se são valores 
	 * 	válidos (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo
	 * 			area=(base.altura)/2
	 */
		real base, altura, area

		escreva("Insira aqui o valor da base para calcular a área do triângulo: \n")
		leia(base)

		escreva("Agora insira o valor da altura do triângulo: \n")
		leia(altura)

		area=(base*altura)/2
		se(area>0){
			escreva("A área do triângulo é " , area)
			
		}senao
			escreva("Erro, valores incorretos")
	}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */