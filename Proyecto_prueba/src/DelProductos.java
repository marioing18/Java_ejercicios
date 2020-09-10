import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DelProductos extends JPanel implements ActionListener {

	private JTextField t_producto;
	private JButton bEliminar;
	private JLabel mensaje;
	private ArrayList<Producto> productos = new ArrayList<>();
	
	public DelProductos(ArrayList<Producto> productos) {
		
		this.productos =productos;
		setPreferredSize(new Dimension(300,300));
		setLayout(new GridLayout(0,2));
		setBackground(Color.WHITE);
		
		//producto a eliminar
		JLabel n_producto = new JLabel("Tipo de Producto:");
		add(n_producto);
		
		t_producto = new JTextField();
		add(t_producto);
		
		//Boton para eliminar
		bEliminar = new JButton("Eliminar");
		add(bEliminar);
		bEliminar.addActionListener(this);
		
		//Label de mensaje
		mensaje = new JLabel("Sin cambios");
		add(mensaje);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String tipo = t_producto.getText();
			
			for (int i=0; i <= productos.size() - 1; i ++) {
				
				if(productos.get(i).getTipo() == tipo)  {
					productos.remove(i);
					mensaje.setText("Producto eliminado");
					break;
				}
			}
			t_producto.setText("");
		}
		
	}

