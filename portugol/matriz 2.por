programa
{
	inclua biblioteca Util
	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

	funcao inicio()
	{
          inteiro matriz [3][3], soma =0, diagonap =0
          para(inteiro x=0; x<3; x++){
          	para(inteiro y=0; y<3; y++){
          		matriz[x][y]=Util.sorteia(1, 12)

          		soma=soma+matriz[x][y]
          		
          		
          	}
          	diagonap=diagonap+matriz[x][x]
          }
          escreva("a soma da matriz é ",soma,"\n")
          escreva("a soma da diagonal principal é ", diagonap,"\n")
          
          
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 498; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */