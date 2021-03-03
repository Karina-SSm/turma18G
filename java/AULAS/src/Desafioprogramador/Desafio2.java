package Desafioprogramador;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in) ;
		double areaT1 =0, areaT2 =0, areaT3 =0,base1 =0,base2 =0, base3 =0,
				altura1 =0, altura2 =0,altura3 =0, maiorT =0;
		System.out.println("entre com valor de base 1");
		base1= ler.nextDouble();
		System.out.println("entre com valor de base 2");
		base2= ler.nextDouble();
		System.out.println("entre com valor de base 3");
		base3= ler.nextDouble();
		System.out.println("entre com valor de altura 1");
		altura1= ler.nextDouble();
		System.out.println("entre com valor de altura 2");
		altura2= ler.nextDouble();
		System.out.println("entre com valor de altura 3");
		altura3= ler.nextDouble();
		areaT1 = base1 * altura1 / 2;
		areaT2 = base2 * altura2 /2;
		areaT3 = (base3 * altura3) / 2;
		if(areaT1 > areaT2 &&  areaT1 > areaT3) {
			maiorT= areaT1;
		}
		if(areaT2 > areaT1 && areaT2 > areaT3) {
			maiorT = areaT2;
		}
		if(areaT3 > areaT1  && areaT3 > areaT2) {
			maiorT = areaT3;
		}
		System.out.println(" ");
				
				
		System.out.printf("A base do primeiro triangulo é:%.2f é sua altura é %f ", base1,altura1 , "\n");
		System.out.printf("A base do segundo triangulo é:%.2f é sua altura é %f ", base2,altura2 , "\n");
		System.out.printf("A base do terceiro triangulo é:%.2f é sua altura é %f ", base3,altura3, "\n");
		System.out.printf("O maior triangulo é: %f ", maiorT, "\n");
	}

}
