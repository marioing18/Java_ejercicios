import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/*
 <applet code = "AppRegistro" width = 300 height= 150>
 </applet>
 */

public class AppRegistro extends Applet implements ActionListener {
	
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public void init () {
		
		//Paneles a utilizar
		EmpleadosPanel panel_e = new EmpleadosPanel(empleados);
		ProductosPanel panel_p = new ProductosPanel(productos);
		PanelConsultas panel_c = new PanelConsultas(empleados, productos);
		DelEmpleados del_e = new DelEmpleados(empleados);
		DelProductos del_p = new DelProductos(productos);
		PanelPrincipal panel1 = new PanelPrincipal();
		
		
		
		JMenuBar menuBar = new JMenuBar();
		add(menuBar, BorderLayout.NORTH);
		add(panel1, BorderLayout.CENTER);
		
		
		JMenu empleados = new JMenu("Empleados");
		JMenu productos = new JMenu("Productos");
		JMenu consultas = new JMenu("Consultas");
		
		
		//Submenus
		JMenuItem insert_e = new JMenuItem("Insertar/actualizar");
		JMenuItem delete_e = new JMenuItem("Eliminar");
		JMenuItem inicio = new JMenuItem("Pagina inicial");
		

		
		//Menú de empleados
		empleados.add(insert_e);
		empleados.add(delete_e);
		
		menuBar.add(empleados);
		
		//Submenus productos
		JMenuItem insert_p = new JMenuItem("Insertar/actualizar");
		JMenuItem delete_p = new JMenuItem("Eliminar");
		
		//Menú de productos
		productos.add(insert_p);
		productos.add(delete_p);
		menuBar.add(productos);
		
		//Submenus productos
		JMenuItem consul_e = new JMenuItem("Consultar Empleados/productos");
				
		//Menú consultas
		consultas.add(consul_e);
		consultas.add(inicio);
		
		menuBar.add(consultas);
		
		//Eventos para todos los submenus
		//Submenus de empleados
		insert_e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				   add(panel_e, BorderLayout.SOUTH);
				   panel_e.setVisible(true);
				   
				   del_e.setVisible(false);
				   del_p.setVisible(false);
				   panel_c.setVisible(false);
		           panel1.setVisible(false);
		           panel_p.setVisible(false);
		           validate();
		       }
		} );
		
		delete_e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				   add(del_e, BorderLayout.SOUTH);
				   del_e.setVisible(true);
				   
				   del_p.setVisible(false);
				   panel_e.setVisible(false);
		           panel1.setVisible(false);
		           panel_p.setVisible(false);
		           validate();
		       }
		} );
		
		//Submenus de productos
		insert_p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				   
				add(panel_p, BorderLayout.SOUTH);
				   panel_p.setVisible(true);
				   
				   del_e.setVisible(false);
				   del_p.setVisible(false);
				   panel_c.setVisible(false);
				   panel_e.setVisible(false);
		           panel1.setVisible(false);
		           validate();
		       }
		});
		
		delete_p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				   add(del_p, BorderLayout.SOUTH);
				   del_p.setVisible(true);
				   
				   del_e.setVisible(false);
				   panel_c.setVisible(false);
				   panel_e.setVisible(false);
		           panel1.setVisible(false);
		           panel_p.setVisible(false);
		           validate();
		       }
		} );
		
		
		//Submenus de consultas
		consul_e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				   add(panel_c, BorderLayout.SOUTH);
				   panel_c.setVisible(true);
				   
				   del_e.setVisible(false);
				   del_p.setVisible(false);
				   panel_e.setVisible(false);
		           panel1.setVisible(false);
		           panel_p.setVisible(false);
		           validate();
		       }
		} );
		
		//menú de retorno al inicio
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
		           panel1.setVisible(true);
		           panel_c.setVisible(false);
		           panel_e.setVisible(false);
		           panel_p.setVisible(false);
		           del_e.setVisible(false);
				   del_p.setVisible(false);
		           validate();
		       }
		} );
	}
	
	
	public AppRegistro() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
}



