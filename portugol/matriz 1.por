programa
{
	inclua biblioteca Util
/*3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
	funcao inicio()
	{
	inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6]
	para(inteiro x=0; x<4; x++){
		para(inteiro y=0; y<6; y++){
			n1[x][y]= Util.sorteia(0,26)
			n2[x][y]= Util.sorteia(0,26)
		}
	}
	para(inteiro x=0; x<4; x++){
		para(inteiro y=0; y<6; y++){
			m1[x][y]= n1[x][y]+n2[x][y]
			m2[x][y]= n1[x][y]-n2[x][y]
		}
	
	}
	para(inteiro x=0; x<4; x++){
		para(inteiro y=0; y<6; y++){
			escreva(" matriz 1 ", m1[x][y],"\n")
			escreva(" matriz 2 ", m2[x][y],"\n")
		}
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 796; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */