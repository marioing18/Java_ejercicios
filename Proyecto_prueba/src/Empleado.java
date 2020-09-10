
public class Empleado {
	
	private String nombre, apellido, edad, telefono, correo,
	   direccion, puesto= new String();
	
	//Constructor por defecto
	public Empleado() {
		nombre=(" ");
		apellido=(" ");
		edad=(" ");
		telefono=(" ");
		correo=(" ");
		direccion=(" ");
		puesto=(" ");
	}
	
	//Constructor por especificaciones
	public Empleado(String nombre, String apellido, String edad, String telefono,
					String correo, String direccion, String puesto) {
		this.nombre=(nombre);
		this.apellido=(apellido);
		this.edad=(edad);
		this.telefono=(telefono);
		this.correo=(correo);
		this.direccion=(direccion);
		this.puesto=(puesto);
	}
	
	public String ToString(){	
		return(nombre + " " + apellido + " de " + edad + " cuyo puesto es \n"
				+ puesto + " vive en " + direccion + "\n" + " su teléfono es "
				+ telefono + "\n" + " y " + correo);
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
