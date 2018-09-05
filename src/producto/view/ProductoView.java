package producto.view;

import java.util.Scanner;

import com.tienda.view.InputTypes;

import categoria.entity.NoExisteCategoria;
import producto.control.Productos;
import producto.entity.Producto;

public class ProductoView {
	private Productos productos;
	private Scanner scanner;
	private Categorias categorias; 
	
	public ProductoView(Productos productos, Categorias categorias, ) {
	 	productos = new Productos (n);
	 	this.categorias = categorias;
	 	this.scanner = scanner;
	}
	
	public void add() {
		Producto producto;
		
		producto = RegistroProducto.ingresar(scanner, categorias);
		productos.ingresar(producto);
	}
	public void list() {
		int codCategoria=0;
		int indiceCategoria = 0;
		
		for (int i=0; i<=productos.getCantidad(); i++) {
			System.out.println(productos.getProductos()[i]);
			codCategoria = productos.getProductos()[i].getCodCategoria();
		try {
			indiceCategoria = categorias.buscar(codCategoria);
			System.out.println(categorias.getCategorias()[indiceCategoria]);
		}catch (NoExisteCategoria e) {
			e.printStackTrace();
		}
	}

}
