package org.generation.letras;

// --- Lógica del Programa.
// Grupo 1 -> Métodos booleanos para determinar si el texto proporcionado contiene o no, los caracteres específicos 
// Grupo 2 -> Métodos int para realizar el conteo de cada tipo de caracter

public class Contador {
	// ---- Grupo 1
	
	// - Vocales
	public boolean esVocal(char caracter) {
		return (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U');
	}
	
	// - Consonantes. Se sigue recibiendo un parámetro de tipo char. Sin embargo, hay que evaluarlo con base en la tabla ASCII, por lo tanto, hay que realizar un casteo a tipo short
	public boolean esConsonante(char caracter) {
		// Casteo de caracter a short
		short codigoAscii = (short) caracter;
		return (((codigoAscii >= 65 && codigoAscii <= 90) || (codigoAscii >= 97 && codigoAscii <= 122)) && !esVocal(caracter));
	}
	
	// - Números 48-57
	public boolean esNumero(char caracter) {
		short codigoAscii = (short) caracter;
		return (codigoAscii >=48 && codigoAscii <=57);
	}
	
	// - Símbolos
	public boolean esSimbolo(char caracter) {
		return !(esVocal(caracter) || esConsonante(caracter) || esNumero(caracter));
		// return (!esVocal(caracter) && !esConsonante(caracter) && !esNumero(caracter));
	}
	
	// ---- Grupo 2. String -> char... String.toCharArray()
	
	// - Vocales
	public int contarVocales(String texto) {
		int vocales = 0;
		for (char caracter : texto.toCharArray()) {
			if (esVocal(caracter)) {
				vocales++;
			}
		}
		return vocales;
	}
	
	// - Consonantes
	public int contarConsonantes(String texto) {
		int consonantes = 0;
		for (char caracter : texto.toCharArray()) {
			if (esConsonante(caracter)) {
				consonantes++;
			}
		}
		return consonantes;
	}
	
	// - Números
	public int contarNumeros(String texto) {
		int numeros = 0;
		for (char caracter : texto.toCharArray()) {
			if (esNumero(caracter)) {
				numeros++;
			}
		}
		return numeros;
	}
	
	// - Simbolos
	public int contarSimbolos(String texto) {
		int simbolos = 0;
		for (char caracter : texto.toCharArray()) {
			if (esSimbolo(caracter)) {
				simbolos++;
			}
		}
		return simbolos;
	}
	
	// - Simbolos, modo II de Alexis
	public int contarSimbolos2(String texto) {
		int simbolos = texto.length() - contarConsonantes(texto) - contarVocales(texto) - contarNumeros(texto);
		return simbolos;
	}
	
	
	
	
	

}
