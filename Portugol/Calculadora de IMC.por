programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	real peso, altura, imc
	logico calcular
		
	escreva ("Você quer calcular seu IMC? \n",
	"Vamos calcular!\n\n")

		escreva ("Digite seu peso\n")
		leia(peso)

		escreva ("Digite sua altura\n")
		leia(altura)
	

	imc = peso/(altura*altura)

	escreva("Já calculamos!")

	se(imc < 16){
		escreva("\n\n Seu IMC é " ,mat.arredondar(imc,2), " e seu IMC é classificado como MAGREZA GRAVE.\n",
		"Consulte uma UBS assim que possível!")
	}
	senao se(imc < 17){
		escreva("\n\n Seu IMC é " ,mat.arredondar(imc,2), " e seu IMC é classificado como MAGREZA MODERADA.\n",
		"Consulte uma UBS assim que possível!")

	}
	senao se (imc < 18.5){
		escreva("\n\n Seu IMC é " ,mat.arredondar(imc,2), " e seu IMC é classificado como MAGREZA LEVE.\n",
		"Consulte uma UBS assim que possível!")
	}
	senao se (imc < 25){
		escreva("\n\n Seu IMC é " ,mat.arredondar(imc,2), " e seu IMC é classificado como SAUDÁVEL!\n",
		"Parabéns! Seu peso é ideal para sua saúde!")
	}
	senao se (imc < 30){
		escreva("\n\n Seu IMC é " ,mat.arredondar(imc,2), " e seu IMC é classificado como SOBREPESO!\n",
		"Pratique exercícios e coma menos alimentos processados para evitar o risco de doenças cardiovasculares")
	}
	senao se (imc < 35){
		escreva("\n\n Seu IMC é " ,mat.arredondar(imc,2), " e seu IMC é classificado como GRAU 1 DE OBESIDADE\n",
		"Pratique exercícios e coma menos alimentos processados para evitar o risco de doenças cardiovasculares")
	}
	senao se (imc < 40){
		escreva("\n\n Seu IMC é " ,mat.arredondar(imc,2), " e seu IMC é classificado como OBESIDADE SEVERA(GRAU 2)!!!!!\n",
		"Procure uma UBS o mais rápido possível e faça exames de rotina com frequência!")
	}
	senao{
		escreva("\n\n Seu IMC é " ,imc, " e seu IMC é classificado como OBESIDADE MÓRBIDA)!!!!!\n",
		"Procure uma UBS o mais rápido possível e faça exames de rotina com frequência!")
		
	

	
	}

	}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1724; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */