package com.tienda.view;

import java.util.Scanner;

public class InputTypes {
public static int readInt(String msg, Scanner scanner) {
	int valor = 0;
	while (true) {
		try {
			System.out.print(msg);
			valor = scanner.nextInt();
			scanner.nextLine();
			break;} 
		
		catch (java.util.InputMismatchException e) {
			System.out.println("Debe ingresar valores numericos");
			scanner.nextLine();
		}
	}
		return valor;
	}
public static String readString(String string, Scanner scanner) {
	return null;
	
}
public static double readDouble(String string, Scanner scanner) {
	return 0;
}
}
