package modelo;

import java.util.ArrayList;
import java.util.List;

public class MascotaModel {
    private List<Mascota> mascotas;

    public MascotaModel() {
        mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public Mascota buscarPorId(int id) {
        for (Mascota mascota : mascotas) {
            if (mascota.getId() == id) {
                return mascota;
            }
        }
        return null;
    }

    public void eliminarMascota(int id) {
        mascotas.removeIf(m -> m.getId() == id);
    }
}
