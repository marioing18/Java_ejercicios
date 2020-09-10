import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel {

	
	public PanelPrincipal()  {
		
			setPreferredSize(new Dimension(300, 150));
			setBackground(Color.WHITE);
			add(new JLabel("Sistema de Gestión"));
		}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
	}
	}

