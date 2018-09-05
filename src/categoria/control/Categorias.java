package categoria.control;

import java.util.ArrayList;
import java.util.Iterator;

import categoria.entity.Categoria;
import categoria.entity.NoExisteCategoria;


public class Categorias {
	
	private ArrayList<Categoria> categorias;
	private int cantidad;
	private int ultimo;

	public Categorias () {
		categorias = new ArrayList<Categoria>();
		cantidad=0;
		ultimo=-1;
		
	}
	public void ingresar(Categoria categoria) throws java.lang.ArrayIndexOutOfBoundsException {
		categorias.add(categoria);
    }
	public void eliminar (int codCategoria) throws NoExisteCategoria {
		int indice = buscar(codCategoria);
		categorias.remove(indice);
		}
	
	public int buscar (int codCategoria) throws NoExisteCategoria {
		Categoria categoria =null;
		int indice = -1;
		for (Iterator<Categoria> iterator = categorias.iterator();iterator.hasNext();) {
			categoria = iterator.next();iodk (codCategoria == categoria.getCodCategoria()) {
				indice = categorias.indexOf(categoria);
				break;
			
		}
		if (indice == -1) {
			throw new NoExisteCategoria(); 
		}
		return indice;
		
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public ArrayList<Categoria> getCategoria() {
		return categorias;
	
	
	}
	/*	
		if (valor == false) {
			throw new NoExisteCategoria();
		}
		return valor;
	}
	


	*/

}
