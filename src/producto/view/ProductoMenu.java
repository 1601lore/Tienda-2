package producto.view;

import java.util.Scanner;

import com.tienda.view.InputTypes;

public class ProductoMenu {
	
private static int encabezado(Scanner scanner) {
	int opcion;
	
	while (true) {
		System.out.println("Ingrese una opcion");
		System.out.println("------------------");
		System.out.println("1. Ingresar Producto");
		System.out.println("2. Listar Productos");
		System.out.println("3. Eliminar Producto");
		System.out.println("0. Salir");
		System.out.println();
		
		opcion = InputTypes.readInt("¿Su opción?", scanner);
		if (opcion>= 0 && opcion <=3) {
			return opcion;
		}
	}
}
public static void menu(Scanner scanner, ProductoView productoView) {
	boolean salir = false;
	
	while (!salir) {
		switch (encabezado(scanner)) {
		case 0:
			salir = true;
			break;
		case 1:
			productoView.add();
			break;
		case 2:
			productoView.list();
			break;
		case 3:
			productoView.delete();
			break;
		
		}
	}}
}