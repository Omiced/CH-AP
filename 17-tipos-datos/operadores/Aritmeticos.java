package com.operadores;

import java.util.Scanner;

public class Aritmeticos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int salary = 75984;	
		double isr = 30D;//porcentaje
		double isrDecimal = isr * 0.01;
		double descuentoISR = salary * isrDecimal;
		System.out.println("El isr en deciaml es: " + isrDecimal);
		System.out.println("El descuento de tu salario seria: " + descuentoISR);
		double netSalary = (double) salary - descuentoISR;
		System.out.println("Tu salario después del ISR es: " + netSalary);
		
		float calificacion1 = 9f;
		float calificacion2 = 5F;
		float calificacion3 = 4.5f;
		float calificacion4 = 7f;
		
		float sumaCalificaciones = calificacion1 + calificacion3 + calificacion2 + calificacion4;
		System.out.println("la suma de las calificaciones es: " + sumaCalificaciones);
		float promedio =  sumaCalificaciones / (float) 4;
		System.out.println("El promedio del grupo fue: " + promedio);
		
		int parOImpar = 0;
		System.out.println("Ingresa un Numero: ");
		int inputNumber = scan.nextInt();
		
		if(inputNumber % 2 == 0) {
			System.out.println("El numero: " + inputNumber+ " es par jijiji");
		}else {
			System.out.println("El numero: " + inputNumber + " no es par 😢");
		}
		
		System.out.println(20.20 % 2);
		
		scan.close();
	}//main

}//Aritmeticos
