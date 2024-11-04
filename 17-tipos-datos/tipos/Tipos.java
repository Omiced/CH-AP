package com.tipos;

public class Tipos {
	//variables de instancia
	static int edad = 10;
	static double salario = 202.2;
	//para float va con una f al final
	static float iva = 0.16f;
	
	//wrappers
	static String nombre = "Josue";
	Double isr = 17.92;
	Integer edadTortuga = 200;
	//public es accesible para todo en el proyecto
	//static se ejecuta desde la clase
	//void no retorna nada
	//main es el nombre del metodo donde se ejecuta todo y palabra reservada.
	//String[] args puede recibe un array de tipo string como argumentos
	public static void main(String[] args) {
		//para declarar un char va con comillas simples
		// para hacer constantes en Java se usa la palabra resevada final
		final char letra = 'a';
		System.out.println("Soy tipo de dato primitivo int " + edad);
		System.out.println("Soy tipo de dato primitivo double " + salario);
		System.out.println("Soy tipo de dato primitivo float " + iva);
		System.out.println("Soy tipo de dato primitivo chart " + letra);
		System.out.println("Soy tipo de dato String " + nombre );
		System.out.println("nuevo valor de letra " + letra);
	}
	
}
