programa
{
	
	funcao inicio()
	{
		inteiro idade,A1,B1,A2,B2,A3
		escreva("entre com idade")
		leia(idade)
		se(idade>=5 e idade<=7){
			escreva("Infantil A1:")
		}
		senao se(idade>=8 e idade<=11){
			escreva("Infantil B1:")
			
		}
		senao se(idade>=12 e idade<=13){
			escreva("Juvenil A2")
		}
		senao se (idade>=14 e idade<=17){
			escreva("Juvenil B2")
			
		}
		senao{
			escreva("adultos")
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */