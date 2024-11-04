package com.tipos;

public class Parseo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "121321";
		// si intentamos hacer un parse int de algo con caracteres no númericos da una exception
		String fecha = "28/10/24";
		boolean isValid = true;
		int edad = 30;
		Boolean isInvalid = false;
		
		
		int idNumero = Integer.parseInt(id);
		String edadText = String.valueOf(edad);
		//int fechaNumero = Integer.parseInt(fecha);
		String booleanText = String.valueOf(isValid);
		System.out.println("Converti un string a un int " + idNumero);
		System.out.println("Converti un boolean a String " + booleanText);
		System.out.println(Boolean.parseBoolean("abcd"));
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("TRUE"));
		System.out.println(Boolean.parseBoolean("TrUE"));
		System.out.println(Boolean.parseBoolean("on"));
		System.out.println(Boolean.parseBoolean("y"));
		System.out.println(Boolean.parseBoolean("t"));
		System.out.println(Boolean.parseBoolean("yes"));
		System.out.println(Boolean.parseBoolean("1"));
		System.out.println(Boolean.parseBoolean("0"));
		System.out.println(edadText);
		System.out.println(!false);
		//System.out.println(fechaNumero);
		
	}

}
