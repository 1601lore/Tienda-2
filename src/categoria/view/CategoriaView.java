package categoria.view;

import java.util.Iterator;
import java.util.Scanner;

import com.tienda.view.InputTypes;

import categoria.control.Categorias;
import categoria.entity.Categoria;
import categoria.entity.NoExisteCategoria;
import producto.control.Productos;


public class CategoriaView {
	private Categorias categorias;
	private Scanner scanner;
	
	public CategoriaView(int n, Scanner scanner) {
	 	categorias = new Categorias (n);
	 	this.scanner = scanner;
	}
	
	public void add() {
		Categoria categoria;
		
		categoria = RegistroCategoria.ingresar(scanner);
		categorias.ingresar(categoria);
	}
	public void list() {
		for (Iterator<Categoria> i = categorias.getCategoria().iterator();
				i.hasNext();) {
			System.out.println(i.next());
		}
		
	}

	public void delete() throws NoExisteCategoria {
		int codCategoria = InputTypes.readInt("Código de categoría:", scanner);
		categorias.eliminar(codCategoria);
	
		
	}
	public void listProducts() throws NoExisteCategoria {
		int codCategoria = InputTypes.readInt("Codigo de categoria ", scanner);
		System.out.println(categorias.getCategoria().get(categorias.buscar(codCategoria)));
		for (int i = 0; i<productos.getCantidad(); i++) {
			if (codCategoria == productos.getProductos()[i].getCodCategoria())
				System.out.println(productos.getProductos()[i]);
		
			
		}
	}




}
