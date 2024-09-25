import controlador.Coordinador;
import modelo.MascotaModel;
import vista.*;

public class Main {
    public static void main(String[] args) {
        // Crear el coordinador que manejará la interacción entre el modelo y las vistas.
        Coordinador coordinador = new Coordinador();

        // Inicializar el modelo de mascotas.
        MascotaModel mascotaModel = new MascotaModel();
        coordinador.setMascotaModel(mascotaModel);

        // Crear las vistas necesarias y vincularlas con el coordinador.
        InterfazPrincipal interfazPrincipal = new InterfazPrincipal(coordinador);
        RegistroMascotaView registroMascotaView = new RegistroMascotaView(coordinador);
        ConsultaMascotaView consultaMascotaView = new ConsultaMascotaView();
        IntegrantesView integrantesView = new IntegrantesView();

        // Configurar las vistas en el coordinador.
        coordinador.setMainView(interfazPrincipal);
        coordinador.setRegistroMascotaView(registroMascotaView);
        coordinador.setConsultaMascotaView(consultaMascotaView);
        coordinador.setIntegrantesView(integrantesView);

        // Hacer visible la interfaz principal.
        interfazPrincipal.setVisible(true);
    }
}
