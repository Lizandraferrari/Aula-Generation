programa
{
	
	funcao inicio()
	{
		//*6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
/*categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
	*/

		cadeia nome
		cadeia sobrenome
		inteiro tempo
		cadeia modo
		inteiro idade

		escreva("Bem vindo a inscrição do campeonato paulista de nado. \n",
		"Insira aqui apenas seu primeiro nome:\n")
		leia(nome)

		escreva("Agora insira seu ultimo sobrenome:\n")
		leia(sobrenome)

		escreva ("Qual sua modalidade praticada?\n")
		leia(modo)

		escreva("E a quantos anos você pratica nessa modalidade?\n")
		leia(tempo)

		escreva("E por ultimo, precisamos saber sua idade:\n")
		leia(idade)

	
			se (idade <5){
			escreva("Você ainda não tem idade suficiente para participar do campeonato.")
				}senao se(idade <=7){
				escreva("Parabéns! Você foi inscrito na modalidade infantil A")
				
				}senao se(idade <=11){
				escreva("Parabéns! Você foi inscrito na modalidade infantil B")
				
				}senao se(idade <=13){
				escreva("Parabéns! Você foi inscrito na modalidade juvenil A")
				
				}senao se(idade <=17){
				escreva("Parabéns! Você foi inscrito na modalidade juvenil B")
				}senao{
					escreva("Parabéns! Você foi inscrito na modalidade adulto")
			}
			
		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1299; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */