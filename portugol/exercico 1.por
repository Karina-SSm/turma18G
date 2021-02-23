programa
{
	
	funcao inicio()
	{
	real P
	real M
	real E
	 
	escreva("pesagem, vamos pesar seu produto ")
	escreva("Informe o peso do produto")
	leia(P)
	
	E=P-50
	M=4.0*E
	se(P>50){
		escreva(" seu peso ultrapasou o limite de:" ,E, " e gerou uma multa no valor:",M)
		
	}
	senao se (P<=50){
		E=0
		M=0.00
		escreva("seu peso ultrapasou o limite de:",E, " e gerou uma multa no valor :",M)
		escreva("\n tudo certo com sua compra!!!")
	}

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 440; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */