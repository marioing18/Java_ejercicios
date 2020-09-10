import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ProductosPanel extends JPanel implements ActionListener {
	
	private JTextField t_nombre_p, t_cantidad, confirmacion;
	private JTextArea t_descripcion;
	private JButton insertar_p;
	private ArrayList<Producto> productos = new ArrayList<>();
	
	public ProductosPanel(ArrayList<Producto> productos) {
		this.productos = productos;
		setPreferredSize(new Dimension(300,300));
		setLayout(new GridLayout(0,2));
		setBackground(Color.WHITE);
		
		
		//Tipo de producto
		JLabel nombre_p = new JLabel("Tipo:");
		add(nombre_p);
		t_nombre_p = new JTextField();
		add(t_nombre_p);
		
		//Cantidad del producto
		JLabel cantidad = new JLabel("Cantidad:");
		add(cantidad);
		t_cantidad = new JTextField();
		add(t_cantidad);
		
		//Descripción del producto
		JLabel descripcion = new JLabel("Descripción:");
		add(descripcion);
		t_descripcion = new JTextArea(4, 10);
		add(t_descripcion);
		
		//Boton para actualizar / insertar
		insertar_p = new JButton("Insertar / Actualizar");
		add(insertar_p);
		
		//Label para el mensaje
		confirmacion = new JTextField("Sin cambios");
		add(confirmacion);
		
		insertar_p.addActionListener(this);
		
	}
	
	//Evento del botón para anexar o actualizar productos
	public void actionPerformed(ActionEvent e) {
		String tipo = t_nombre_p.getText();
		String cantidad = t_cantidad.getText();
		String descripcion = t_descripcion.getText();
		
		Producto aux = new Producto();
		aux.setTipo(tipo);
		aux.setDescripcion(descripcion);
		aux.setCantidad(cantidad);
		
		if (productos.isEmpty() == true) {
			productos.add(aux);
			confirmacion.setText("Actualización exitosa!!");
		}else if (t_nombre_p.getText() != "" || t_cantidad.getText() != "" 
				|| t_descripcion.getText() != "") {
			
			for (int i = 0; i <= productos.size() - 1; i ++) {
				//if para insertar
				if(productos.get(i).getTipo() != tipo ||
						productos.get(i).getCantidad() != cantidad) {
					
					productos.add(aux);
					confirmacion.setText("Actualización exitosa!!");
					break;
					
					//condición para actualizar
				}else if (productos.get(i).getTipo() == tipo &&
						(productos.get(i).getCantidad() != cantidad
						|| productos.get(i).getDescripcion() != descripcion)){
					
				}else if (productos.get(i).getTipo() == tipo &&
						productos.get(i).getCantidad() == cantidad
						&& productos.get(i).getDescripcion() == descripcion) {
					
					confirmacion.setText("No actualizado, es un valor duplicado");
					break;
				}	
			}
		}
		
		t_nombre_p.setText("");
		t_cantidad.setText("");
		t_descripcion.setText("");
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);		
	}
}
