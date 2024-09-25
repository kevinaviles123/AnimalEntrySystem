package vista;

import controlador.Coordinador;
import javax.swing.*;
import java.awt.*;

public class InterfazPrincipal extends JFrame {
    private JButton btnRegistrarMascota;
    private JButton btnMostrarIntegrantes;
    private JButton btnSalir;

    public InterfazPrincipal(Coordinador coordinador) {
        // Establecer el título de la ventana
        setTitle("Bienvenido a PetraNova System");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Crear botón "Ingresar Mascota" (Verde)
        btnRegistrarMascota = new JButton("Ingresar Mascota");
        btnRegistrarMascota.setBackground(Color.GREEN);
        btnRegistrarMascota.addActionListener(e -> coordinador.mostrarRegistroMascota());

        // Crear botón "Mostrar Integrantes" (Verde)
        btnMostrarIntegrantes = new JButton("Mostrar Integrantes");
        btnMostrarIntegrantes.setBackground(Color.GREEN);
        btnMostrarIntegrantes.addActionListener(e -> coordinador.mostrarIntegrantes());

        // Crear botón "Salir" (Rojo)
        btnSalir = new JButton("Salir");
        btnSalir.setBackground(Color.RED);
        btnSalir.addActionListener(e -> System.exit(0)); // Cerrar la aplicación

        // Añadir componentes a la ventana
        add(new JLabel("Bienvenido a PetraNova System"));
        add(btnRegistrarMascota);
        add(btnMostrarIntegrantes);
        add(btnSalir); // Añadir el botón de salida
    }
}