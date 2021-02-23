programa
{
	inclua biblioteca Matematica
	
	
	funcao inicio()
	{
		inteiro Num1
		inteiro Num2 
		inteiro Num3 
		inteiro Num4

		inteiro Qd1
		inteiro Qd2
		inteiro Qd3
		inteiro Qd4
		
		escreva("entre com primeiro numero")
		leia(Num1)
		escreva("entre com segundo numero")
		leia(Num2)
		escreva("entre com terceiro numero")
		leia(Num3)
		escreva("entre com quarto numero")
		leia(Num4)
		Qd1=Matematica.potencia(Num1, 2)
		Qd2=Matematica.potencia(Num2, 2)
		Qd3=Matematica.potencia(Num3, 2)
		Qd4=Matematica.potencia(Num4, 2)
		
		se(Num3>1000)
		{
			escreva("programa finalizaado")
			
			
		}
		senao se(Num3<1000){
			escreva ("Num1 ao:",Num1,"quadrado:",Qd1," é")
			escreva ("\n Num2 ao:",Num2, "quadrado:",Qd2,"é")
			escreva ("\n Num3 ao:",Num3, "quadrado:",Qd3, "é")
			escreva ("\n Num4 ao :",Num4, "quadrado:",Qd4,"é")
			
			
			
			
			
		}
		
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 601; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */