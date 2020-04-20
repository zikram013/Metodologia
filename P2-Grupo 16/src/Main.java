import controlador.Controlador;
import modelo.Admin;
import modelo.Estudiante;
import modelo.Usuario;

public class Main {

    public static  Controlador controlador = new Controlador();
    public static void main (String[] arg){

        Usuario usuario = new Estudiante("Angel", "Chino", "el chino", "angel@urjc.es", "chino","estudiante");
        Usuario usuario1 = new Estudiante("Angel", "Chino", "almendra", "almendra@urjc.es", "españolito","admin");


        controlador.guardarUsuario(usuario);
        controlador.guardarUsuario(usuario1);

        controlador.listaUsuarios();

        controlador.iniciarSession();

    }
}
