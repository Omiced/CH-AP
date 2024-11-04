package com.operadores;
import java.util.Scanner;
public class Aprobado {
	/*
	 * 1. importar e instanciar un scanner
	 * 2. el usuario va ingresar float
	 * 3. sumarlos y guardarlos en una variable
	 * 4. se va repetir 3 veces y vamos a usar un for
	 * 5. promediar la suma
	 * 6. condicional
	 * 	6.1 calificacion < 5 reprobado
	 * 	6.2 si calificación >= 6 && calificación < 9 panzaste
	 *  6.3 si calificacion >= 9 && calificacion < 10 eres todo un hacker
	 *  6.4 si calificacion == 10 eres todo un einstein
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// instancia de la Clase Scanner
		Scanner scan = new Scanner(System.in);
		float cal = 0;
		float promedio;
		int intentos = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println("Ingresa tu calificación numero " + (i + 1));
			float calEvaluada = Aprobado.calificacionValida(scan.nextFloat());
			//si el valor de retorno es -1 
			if(calEvaluada  == -1) {
				System.out.println("Ingresaste un número invalido, prueba con números mayores de 0 y menores o iguales 10");
				System.out.println("Te quedan " + (5-intentos) + " intentos");
				intentos++;
				i--;
				if(intentos == 5) {
					System.out.println("Muchos intentos fallidos terminando el programa");
					break;
				}
				continue;
			}else {
				cal += calEvaluada;
			}
			// cal = cal  + scan.nextFloat();
		}
		scan.close();
		promedio = cal / 3;
		System.out.println("tu promedio es: " + promedio);
		System.out.println(evaluacionPromedio(promedio));;
		
		
		
	}//main
	
	public static float calificacionValida(float cal) {
		if(cal < 0 || cal > 10) {
			return -1.0f;
		}
		
		return cal;
	}//calificacionValida
	
	public static String evaluacionPromedio(float promedio) {
		if(promedio < 6) {
			return "Reprobaste 😢";
		}else if( promedio >= 6 && promedio < 9) {
			return "Panzaste 🐢";
		}else if(promedio >= 9 && promedio < 10) {
			return "Eres todo un hacker 🤖";
		}else if(promedio == 10){
			return "Eres todo un Einstein 🧐";
		}else {
			return "Tu calificación no existe. Hiciste trampa";
		}
	}
	
	
}//class
