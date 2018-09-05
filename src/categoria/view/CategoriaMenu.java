package categoria.view;

import java.util.Scanner;

import com.tienda.view.InputTypes;

public class CategoriaMenu {
	private static int encabezado(Scanner scanner) {
		int opcion;
		
		while (true) {
			System.out.println("Ingrese una opcion");
			System.out.println("------------------");
			System.out.println("1. Ingresar Categoria");
			System.out.println("2. Listar Categoria");
			System.out.println("3. Eliminar Categoria");
			System.out.println("0. Salir");
			System.out.println();
			
			opcion = InputTypes.readInt("¿Su opción?", scanner);
			if (opcion>= 0 && opcion <=3) {
				return opcion;
			}
		}
	}
	public static void menu(Scanner scanner, CategoriaView categoriaView) {
		boolean salir = false;
		
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				categoriaView.add();
				break;
			case 2:
				categoriaView.list();
				break;
			case 3:
				try {
				categoriaView.delete();
				} catch (NoExisteCategoria e) {
					System.out.println("No existe la categoria");
				}
				break
			
		
		}
	}

}
