programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//*
		/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
		inteiro num1 , num2 , num3 , num4 

		escreva("\nColoque o valor do número 1: \n")
		leia(num1)

		escreva("\nColoque o valor do número 2: \n")
		leia(num2)
		
		escreva("\nColoque o valor do número 3: \n")
		leia(num3)
		
		escreva("\nColoque o valor do número 4: \n")
		leia(num4)

		se(num3+num3 >= 1000){
		escreva("\nO valor do quadrado do 3ºn é: " , num3+num3)

		}senao{
			escreva("\nOs valores ao quadrado dos números\n",
			"são: " , num1+num1 ,"; ", num2+num2 ,"; ", num3+num3 ," e ", num4+num4 ," respectivamente.")
		}
		

	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 848; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */