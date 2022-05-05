programa
{
	
	funcao inicio()
	{
		//*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
/*horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
*/

	inteiro cod, horas
	real sal, exc=0.0, salExc=0.0

	escreva("Digite o código do operário: \n")
	leia(cod)

	escreva("Digite o total de horas trabalhadas: \n")
	leia(horas)

	se(horas <= 50){
		sal = horas * 10
	}
		senao{
			sal = 50.0 * 10.0
			exc = horas - 50.0
			salExc = exc * 20
			//sal = sal + salExc
			sal += salExc
		}
escreva("\nSalário Excedente: R$", salExc)
escreva("\nSalário Total: R$", sal)
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {sal, 15, 6, 3}-{exc, 15, 11, 3}-{salExc, 15, 20, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */