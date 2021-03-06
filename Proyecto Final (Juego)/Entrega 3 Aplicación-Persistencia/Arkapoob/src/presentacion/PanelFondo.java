package presentacion;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelFondo extends JPanel{
	private Image background;
	public PanelFondo(String ruta) {
		setBackground(ruta);
	}
	public void setBackground(String ruta) {
		setOpaque(false);
		this.background = new ImageIcon(ruta).getImage();
		repaint();
	}
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
		super.paintComponent(g);
	}
}

