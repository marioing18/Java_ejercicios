import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EmpleadosPanel extends JPanel implements ActionListener {
	
	//Array de empleados que se recibe desde el applet
	
	private ArrayList<Empleado> empleados = new ArrayList<>();
	private JTextField t_nombre, t_apellido, t_edad, t_telefono,
					t_correo, t_direccion, t_puesto;
	private JTextField confirmacion;
	private JButton insertar_e;
	
	public EmpleadosPanel(ArrayList<Empleado> empleados) {
		
		this.empleados = empleados;
		setPreferredSize(new Dimension(300,300));
		setLayout(new GridLayout(0,2));
		setBackground(Color.WHITE);
		
		//Campos a llenar
		JLabel nombre_e = new JLabel("Nombre:");
		add(nombre_e);
		t_nombre = new JTextField();
		add(t_nombre);
		
		//apellido
		JLabel apellido = new JLabel("Apellido:");
		add(apellido);
		t_apellido = new JTextField();
		add(t_apellido);
		
		//edad
		JLabel edad = new JLabel("Edad:");
		add(edad);
		t_edad = new JTextField();
		add(t_edad);
		
		//correo
		JLabel correo = new JLabel("Correo:");
		add(correo);
		t_correo = new JTextField();
		add(t_correo);
		
		//telefono
		JLabel telefono = new JLabel("Teléfono:");
		add(telefono);
		t_telefono = new JTextField();
		add(t_telefono);
		
		//direccion
		JLabel direccion = new JLabel("Dirección:");
		add(direccion);
		t_direccion = new JTextField();
		add(t_direccion);
		
		//puesto
		JLabel puesto = new JLabel("Puesto:");
		add(puesto);
		t_puesto = new JTextField();
		add(t_puesto);
		
		//insertar/actualizar empleado
		
		insertar_e = new JButton("Insertar / Actualizar");
		add(insertar_e);
			
		//mensaje de confirmación
		confirmacion = new JTextField("No actualizado");
		add(confirmacion);
		
		//Evento del botón
		
			insertar_e.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		

		String nombre = t_nombre.getText();
		String apellido = t_apellido.getText();
		String edad = t_edad.getText();
		String correo = t_correo.getText();
		String telefono = t_telefono.getText();
		String direccion = t_direccion.getText();
		String puesto = t_puesto.getText();
		
		Empleado aux = new Empleado();
		aux.setNombre(nombre);
		aux.setApellido(apellido);
		aux.setEdad(edad);
		aux.setCorreo(correo);
		aux.setTelefono(telefono);
		aux.setDireccion(direccion);
		aux.setPuesto(puesto);
			
		if (empleados.isEmpty() == true) {
			empleados.add(aux);
			confirmacion.setText("Actualización exitosa!!");
			
		}else {
			//con este for se inserta o actualiza
			for (int i = 0; i <= empleados.size() - 1; i ++) {
				
				//if para actualizar
				if(empleados.get(i).getNombre() == nombre &&
						empleados.get(i).getApellido() == apellido
						|| (empleados.get(i).getEdad() != edad ||
						empleados.get(i).getCorreo() != correo ||
						empleados.get(i).getDireccion() != direccion ||
						empleados.get(i).getTelefono() != telefono ||
						empleados.get(i).getPuesto() != puesto)) {
					
					empleados.add(aux);
					confirmacion.setText("Actualización exitosa!!");
					
					break;
					
				}else if(empleados.get(i).getNombre() != nombre ||
						empleados.get(i).getApellido() != apellido) {
					
				}else  if (i == empleados.size() - 1) {
					//en caso de que existan valores duplicados
					confirmacion.setText("No se ha podido actualizar");
				}
				
			}			
			
		}
		
		t_nombre.setText("");
		t_apellido.setText("");
		t_edad.setText("");
		t_telefono.setText("");
		t_direccion.setText("");
		t_correo.setText("");
		t_puesto.setText("");
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public JTextField getT_edad() {
		return t_edad;
	}

	public void setT_edad(JTextField t_edad) {
		this.t_edad = t_edad;
	}

	public JTextField getT_apellido() {
		return t_apellido;
	}

	public void setT_apellido(JTextField t_apellido) {
		this.t_apellido = t_apellido;
	}

	public JTextField getT_nombre() {
		return t_nombre;
	}

	public void setT_nombre(JTextField t_nombre) {
		this.t_nombre = t_nombre;
	}

	public JTextField getT_telefono() {
		return t_telefono;
	}

	public void setT_telefono(JTextField t_telefono) {
		this.t_telefono = t_telefono;
	}

	public JTextField getT_direccion() {
		return t_direccion;
	}

	public void setT_direccion(JTextField t_direccion) {
		this.t_direccion = t_direccion;
	}

	public JTextField getT_correo() {
		return t_correo;
	}

	public void setT_correo(JTextField t_correo) {
		this.t_correo = t_correo;
	}

	public JTextField getT_puesto() {
		return t_puesto;
	}

	public void setT_puesto(JTextField t_puesto) {
		this.t_puesto = t_puesto;
	}

	public JTextField getConfirmacion() {
		return confirmacion;
	}

	public void setConfirmacion(JTextField confirmacion) {
		this.confirmacion = confirmacion;
	}

}

