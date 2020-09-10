import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class PanelConsultas extends JPanel implements ActionListener {

	private ArrayList<Empleado> empleados = new ArrayList<>();
	private ArrayList<Producto> productos = new ArrayList<>();
	private JTextArea emp_con, prod_con;
	private JButton consul_emp, consul_pro;
	
	public PanelConsultas(ArrayList<Empleado> empleados, ArrayList<Producto> productos) {
		
		this.empleados = empleados;
		this.productos = productos;
		
		setPreferredSize(new Dimension(600,300));
		setLayout(new GridLayout(0,2));
		setBackground(Color.WHITE);
		
		//Ventana de consulta de empleados
		JLabel consulta_e = new JLabel("Consulta de empleados");
		add(consulta_e);
		
		//Ventana de consulta de productos
		JLabel consulta_p = new JLabel("Consulta de productos");
		add(consulta_p);
		
		emp_con = new JTextArea(30,150);
		add(emp_con);
		emp_con.setEditable(false);
		prod_con = new JTextArea(30, 150);
		add(prod_con);
		prod_con.setEditable(false);
		//Botones para iniciar la consulta
		
		consul_emp = new JButton("Consultar Emp.");
		add(consul_emp);
		consul_pro = new JButton("Consultar Prod.");
		add(consul_pro);
		
		consul_emp.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evt) {
				String cadena_aux = new String();
				
				for (int i = 0; i <= empleados.size()-1; i++) {
					cadena_aux += empleados.get(i).ToString() + "\n";
				}
				
				emp_con.setText(cadena_aux);
		       }
		} );
		
		consul_pro.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent evt) {
				
				String cadena_aux_pro = new String();
				
				for (int i = 0; i <= productos.size()-1; i++) {
					cadena_aux_pro += productos.get(i).ToString() + "\n";
				}
				prod_con.setText(cadena_aux_pro);
				
		       }
		} );
	}
	
	public void actionPerformed (ActionEvent e) {
		

	}
}
