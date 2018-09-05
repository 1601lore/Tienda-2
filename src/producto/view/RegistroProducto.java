package producto.view;

import java.util.Scanner;

import com.tienda.view.InputTypes;

import categoria.entity.NoExisteCategoria;
import producto.entity.Producto;

public class RegistroProducto {
	public static Producto ingresar(Scanner scanner, Categorias categorias ) {
		int valor = -1;
		int codProducto =
				InputTypes.readInt("Ingrese el codigo del producto", scanner);
		String nombreProducto=
				InputTypes.readString("Nombre:", scanner);
		double precio=
				InputTypes.readDouble("Precio:",scanner);
		String descripcion=
				InputTypes.readString("Descripcion:", scanner);
	
	    valor=InputTypes.readInt("Codigo categoria:", scanner);
	 if ( !categorias.searchBoolean(valor)) {
	    	int codCategoria = valor;
	    }else {
	    	throw new NoExisteCategoria();
	    }
		
		int codCategoria = valor
		return new
				Producto(codProducto, nombreProducto, precio, descripcion, codCategoria);
	}
	
}

