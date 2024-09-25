package vista;

import modelo.Mascota;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ConsultaMascotaView extends JFrame {
    private JTable tablaMascotas;

    public ConsultaMascotaView() {
        setTitle("Consulta de Mascotas");
        setSize(600, 400);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear la tabla donde se mostrarán las mascotas
        tablaMascotas = new JTable();
        add(new JScrollPane(tablaMascotas), BorderLayout.CENTER);
    }

    // Método para llenar la tabla con la lista de mascotas
    public void llenarTabla(List<Mascota> mascotas) {
        // Definir los nombres de las columnas
        String[] columnNames = {"ID", "Nombre", "Color", "Edad", "Tipo"};

        // Crear una matriz de objetos que contendrá los datos de las mascotas
        Object[][] data = new Object[mascotas.size()][5];

        // Rellenar los datos de las mascotas en la matriz
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            data[i][0] = m.getId();
            data[i][1] = m.getName();
            data[i][2] = m.getColor();
            data[i][3] = m.getAge();
            data[i][4] = m.getType();
        }

        // Establecer el modelo de tabla con los datos y nombres de las columnas
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
    }
}
