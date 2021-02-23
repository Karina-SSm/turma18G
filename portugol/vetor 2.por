programa
{
	inclua biblioteca Util
	/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

	funcao inicio()
	{
		inteiro dado[10], maiorP=0, contador=0
		real media=0.0
		para(inteiro x=0; x<10; x++){
			dado[x]=Util.sorteia(1, 6)
			
			se(dado[x]>maiorP){
				maiorP=dado[x]
				contador++
			}
			
			
			
		}
		para(inteiro x=0; x<10; x++){
			media=media+dado[x]
			escreva(dado[x], "\n")
			
		}
		media=media/10
		escreva("a media é ",media, "\n")
		escreva(" as ocorrencias da maior pontuação foram ",contador)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */