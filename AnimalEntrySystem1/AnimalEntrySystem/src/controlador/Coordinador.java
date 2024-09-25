package controlador;

import modelo.Mascota;
import modelo.MascotaModel;
import vista.*;

public class Coordinador {
    private InterfazPrincipal interfazPrincipal;
    private RegistroMascotaView registroMascotaView;
    private ConsultaMascotaView consultaMascotaView;
    private IntegrantesView integrantesView;
    private MascotaModel mascotaModel;

    public Coordinador() {}

    public void mostrarRegistroMascota() {
        if (registroMascotaView != null) {
            registroMascotaView.setVisible(true);
        }
    }

    public void mostrarConsultaMascota() {
        if (consultaMascotaView != null) {
            consultaMascotaView.llenarTabla(mascotaModel.getMascotas());
            consultaMascotaView.setVisible(true);
        }
    }

    public void mostrarIntegrantes() {
        if (integrantesView != null) {
            integrantesView.setVisible(true);
        }
    }

    public void registrarMascota(Mascota mascota) {
        mascotaModel.agregarMascota(mascota);
    }

    public void setInterfazPrincipal(InterfazPrincipal interfazPrincipal) {
        this.interfazPrincipal = interfazPrincipal;
    }

    public void setRegistroMascotaView(RegistroMascotaView registroMascotaView) {
        this.registroMascotaView = registroMascotaView;
    }

    public void setConsultaMascotaView(ConsultaMascotaView consultaMascotaView) {
        this.consultaMascotaView = consultaMascotaView;
    }

    public void setIntegrantesView(IntegrantesView integrantesView) {
        this.integrantesView = integrantesView;
    }

    public void setMascotaModel(MascotaModel mascotaModel) {
        this.mascotaModel = mascotaModel;
    }

    public void setMainView(InterfazPrincipal interfazPrincipal) {
    }
}
