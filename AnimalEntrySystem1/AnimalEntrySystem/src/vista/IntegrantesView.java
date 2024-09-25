package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class IntegrantesView extends JFrame {

	public IntegrantesView() {
		setTitle("Integrantes con imágenes"); // Método corregido
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 1));

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 2));

		agregarIntegrante(panel, "Kevin Gañan", "file:///C:/Users/bueno/Downloads/AnimalEntrySystem/AnimalEntrySystem/src/Kevin%20Ga%F1an.jpeg");
		agregarIntegrante(panel, "Franchesca Triviño", "file:///C:/Users/bueno/Downloads/AnimalEntrySystem/AnimalEntrySystem/src/Franchesca%20Sofia.jpeg");
		agregarIntegrante(panel, "Jhon Colorado", "file:///C:/Users/bueno/Downloads/AnimalEntrySystem/AnimalEntrySystem/src/Jhon%20Stiven.jpeg");
		agregarIntegrante(panel, "Julian Arias", "file:///C:/Users/bueno/Downloads/AnimalEntrySystem/AnimalEntrySystem/src/Julian%20David.jpeg");
		agregarIntegrante(panel, "John Cardenas", "");
		agregarIntegrante(panel, "Juan Vasquez", "");

		add(panel);

		setVisible(true);
	}

	private void agregarIntegrante(JPanel panel, String nombre, String rutaImagen) {
		JLabel nombreLabel = new JLabel(nombre);
		nombreLabel.setHorizontalAlignment(JLabel.CENTER);

		ImageIcon imagen = new ImageIcon(rutaImagen);
		JLabel imagenLabel = new JLabel(imagen);
		imagenLabel.setHorizontalAlignment(JLabel.CENTER);

		JPanel subPanel = new JPanel();
		subPanel.setLayout(new BorderLayout());
		subPanel.add(imagenLabel, BorderLayout.CENTER);
		subPanel.add(nombreLabel, BorderLayout.SOUTH);

		panel.add(subPanel);
	}

	public static void main(String[] args) {
		new IntegrantesView(); // Paréntesis añadidos
	}
}