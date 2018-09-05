package categoria.entity;

public class NoExisteCategoria extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NoExisteCategoria (String arg0) {
		super ("No existe la categoria");
	
	}

}
