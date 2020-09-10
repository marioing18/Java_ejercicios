import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DelEmpleados extends JPanel implements ActionListener {
	
	private JTextField t_nombre, t_apellido;
	private JButton bEliminar;
	private JLabel mensaje;
	private ArrayList<Empleado> empleados = new ArrayList<>();
	
	public DelEmpleados(ArrayList<Empleado> empleados) {
		
		this.empleados = empleados;
		setPreferredSize(new Dimension(300,300));
		setLayout(new GridLayout(0,2));
		setBackground(Color.WHITE);
		
		//empleado a eliminar
		JLabel n_empleado = new JLabel("Nombre:");
		add(n_empleado);
		
		t_nombre = new JTextField();
		add(t_nombre);
		
		JLabel a_empleado = new JLabel("Apellido:");
		add(a_empleado);
		
		t_apellido = new JTextField();
		add(t_apellido);
		
		//Boton para eliminar
		bEliminar = new JButton("Eliminar");
		add(bEliminar);
		
		//Label de mensaje
		mensaje = new JLabel("Sin cambios");
		add(mensaje);
		
		bEliminar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String nombre = t_nombre.getText();
		String apellido = t_apellido.getText();
		
		if (empleados.isEmpty() != false){
			
			for (int i=0; i <= empleados.size() - 1; i++) {
				
				if(empleados.get(i).getNombre() == nombre && 
						empleados.get(i).getApellido() == apellido) {
					
					empleados.remove(i);
					mensaje.setText("Empleado eliminado");
					break;
				}
			}
			
		}
		
		t_nombre.setText("");
		t_apellido.setText("");
	}
	
	}

//public boolean equals(Object obj) {
//
//if (obj instanceof Empleado) {
//	Empleado empAux = (Empleado) obj;
//	
//	if(super.equals(empAux) && this.nombre.equals(empAux.nombre) &&
//			this.apellido.equals(empAux.apellido) && this.edad.equals(empAux.edad)
//			&& this.direccion.equals(empAux.direccion) && this.telefono.equals(empAux.telefono)
//			&& this.puesto.equals(empAux.puesto) && this.correo.equals(empAux.correo)) {
//		return true;
//	}else {
//		return false;
//	}
//}
//}