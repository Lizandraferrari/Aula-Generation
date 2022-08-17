programa
{
	
	funcao inicio()
	{
		//*
		/*2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.

ENQUANTO	
Resolução do professor Henrique:
		inteiro num

			escreva("Digite um número: ")
			leia(num)

			escreva(num)

			enquanto(num <= 100){
				num*=3
				escreva("\n",num)
				}
*/
		real num , res 
		
		escreva("Bem vindo(a) ao calculo da peste!\nDigite um número para calcular x3 até o valor de 100: \n")
		leia(num)
				res = num*3
				enquanto(res<=100){
					res = res*3
					//*		res = res*3 pode ser escrito como:
					//*		res*= 3
		
				escreva("\n ", res/3 ,"\n", res)
				}
			
		
			}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 740; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */