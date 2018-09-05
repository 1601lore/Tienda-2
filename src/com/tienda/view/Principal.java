package com.tienda.view;

import java.util.Scanner;

import categoria.control.Categorias;
import categoria.entity.NoExisteCategoria;
import categoria.view.CategoriaView;
import producto.control.Productos;
import producto.view.ProductoView;

public class Principal {
	public static void main(String[] args) throws NoExisteCategoria{
	
		Scanner scanner = new Scanner(System.in);
		Categorias categorias = new Categorias(10);
	    Productos  productos= new Productos (10);
	    
	    ProductoView productosView = new ProductoView (productos, categorias);
	    CategoriaView categoriasView = new CategoriaView(categorias, productos, scanner);
	
	    categoria.view.categoriaMenu.menu(scanner, categoriasView);
	    producto.view.ProductoMenu.menu(scanner, productosView);
		scanner.close();
	
		
	}

}
