package com.operadores;

public class Logicos {
	// == solo sirve con primitivos, para evaluar objetos se usa equals();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 2836;
		int c = -16;
		
		
			System.out.println(a > b);
			System.out.println(c > 0);
			System.out.println(c < 0);
			System.out.println(a + b > 3000);
			// operador or regresa true si cualquiera de sus lados es verdadero
			System.out.println((a + b == 2856) || (a+b == 2500));
			System.out.println((a+b == 2500) || (a + b == 2856));
			System.out.println((a + b == 2896) || (a+b == 2500));
			//el operador anda solo regresa true si las dos condiciones son verdaderas
			System.out.println((a + b == 2856) && (a+b == 2500));
			System.out.println((a+b == 2500) && (a + b == 2856));
			System.out.println((a+b == 2856) && (a + b == 2856));
			System.out.println(a - b >= 5);
			System.out.println(a - c >= 10);
			System.out.println(c + 20 <= 4);
			//negación del false = true
			System.out.println(!(a+b == 2856) && (a + b == 2856));
			//negación del true = false
			System.out.println(!(a+b == 2456) || !(a + b == 256));
			System.out.println(!!(a+b == 2856) && !(a + b == 2856));
			System.out.println(a != b);
			System.out.println(!(a != b));
			System.out.println(a > c && b > a && c < b || c > b);
		}

}
