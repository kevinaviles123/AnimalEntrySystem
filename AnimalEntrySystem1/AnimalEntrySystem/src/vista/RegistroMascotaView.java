package vista;

import controlador.Coordinador;
import modelo.Mascota;

import javax.swing.*;
import java.awt.*;

public class RegistroMascotaView extends JFrame {
    private JTextField txtId, txtNombre, txtColor, txtEdad, txtTipo;
    private JButton btnGuardar;

    public RegistroMascotaView(Coordinador coordinador) {
        setTitle("Registrar Mascota");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("ID:"));
        txtId = new JTextField();
        add(txtId);

        add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        add(txtNombre);

        add(new JLabel("Color:"));
        txtColor = new JTextField();
        add(txtColor);

        add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        add(txtEdad);

        add(new JLabel("Tipo:"));
        txtTipo = new JTextField();
        add(txtTipo);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBackground(Color.GREEN);
        btnGuardar.addActionListener(e -> {
            Mascota mascota = new Mascota(
                    Integer.parseInt(txtId.getText()),
                    txtNombre.getText(),
                    txtColor.getText(),
                    txtTipo.getText(),
                    Integer.parseInt(txtEdad.getText())
            );
            coordinador.registrarMascota(mascota);
            JOptionPane.showMessageDialog(null, "Mascota registrada exitosamente");
        });
        add(btnGuardar);
    }
}