package categoria.entity;

public class Categoria {
	public Categoria(int codCategoria, String nombre, String descripcion) {
		super();
		this.codCategoria=codCategoria;
		this.nombre=nombre;
		this.descripcion=descripcion;
	}
	private int codCategoria;
	private String nombre;
	private String descripcion;
	public int getCodCategoria() {
		return codCategoria;
	}
	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Categoria [codCategoria=" + codCategoria + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	
	


}
