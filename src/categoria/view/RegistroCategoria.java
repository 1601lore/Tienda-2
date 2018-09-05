package categoria.view;

import java.util.Scanner;

import com.tienda.view.InputTypes;

import categoria.entity.Categoria;


public class RegistroCategoria {
	public static Categoria ingresar(Scanner scanner) {
	int codCategoria =
			InputTypes.readInt("Ingrese el codigo de la categoria", scanner);
	String nombreCategoria=
			InputTypes.readString("Nombre:", scanner);
	
	String descripcion=
			InputTypes.readString("Descripcion:", scanner);
	
	return new
			Categoria(codCategoria, nombreCategoria,  descripcion);
}

}
