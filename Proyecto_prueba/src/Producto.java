
public class Producto {

	private String tipo, descripcion = new String();
	private String cantidad;
	
	/*
	 * Constructor por defecto
	 * */
	public Producto() {
		tipo=("");
		descripcion =("NA");
		cantidad= ("NA");
	}
	
	/*
	 * Constructor por especificaciones
	 * */
	public Producto(String tipo, String descripcion, String cantidad) {
		this.tipo=(tipo);
		this.descripcion= (descripcion);
		this.cantidad =(cantidad);
	}

	public String ToString() {
		return("Producto " + tipo + " con disponibilidad de " + "\n" +
				cantidad + " unidades " + descripcion);
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
}
