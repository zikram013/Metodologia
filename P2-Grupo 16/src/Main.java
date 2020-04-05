import controlador.Controlador;
import modelo.Admin;

public class Main {

    public static void main (String[] arg){

        Admin admin = new Admin();
        Controlador controlador = new Controlador();

        controlador.iniciarSession();

    }
}
