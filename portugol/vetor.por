programa
{
	/*
	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	 */
	
	funcao inicio()
	{
		inteiro numero[5], contador =0
		
		para(inteiro x=0; x<=4; x++){
			escreva("digite pontuaçaõ")
			leia(numero[x])

			se(numero[x]>contador){
				contador=numero[x]
			}
			
		}
		para(inteiro x=0; x<=4; x++){
			escreva("o valor da posição", x+1, "é ",numero[x], "\n" )
			

			
		}
		escreva("a maior pontuação é ", contador, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 484; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */