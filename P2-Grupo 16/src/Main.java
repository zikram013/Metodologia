import controlador.Controlador;
import controlador.SubForo;
import modelo.Admin;
import modelo.Ejercicio;
import modelo.Entrada;
import modelo.EntradaGenerica;
import modelo.Estudiante;
import modelo.Profesor;
import modelo.TextoPlano;
import modelo.Usuario;

public class Main {

    public static  Controlador controlador = new Controlador();
    public static void main (String[] arg){

        Usuario usuario = new Estudiante("Angel", "Chino", "el chino", "angel@urjc.es", "chino","estudiante");
        Usuario usuario1 = new Estudiante("Ramon", "Barrabes", "ramon1", "ramon@urjc.es", "1234","profesor");
        Usuario usuario2 = new Admin("David", "Amor", "almendra", "almendra@urjc.es", "nose","admin");
        Usuario ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        Usuario ejemplo2 = new Profesor("Gustavo", "Cebrian", "altoke", "gustavo.cebrian@urjc.es", "1234","profesor");
        SubForo sub = new SubForo("MP");
        SubForo newsub = new SubForo("DAW");

        controlador.registrarUsuario(usuario);
        controlador.registrarUsuario(usuario1);
        controlador.registrarUsuario(usuario2);
        
        System.out.println();   
        
        controlador.getSubforos().put(sub.getTitulo(), sub);
        controlador.listaUsuarios();
        
        System.out.println();
        
        controlador.iniciarSession(usuario);
        
        /*Pruebas con el primer usuario con 'Rol'='estudiante'*/
        
        controlador.registrarUsuario(ejemplo);
        controlador.CrearSubforo(sub);
        
        if(controlador.getUsuarioConectado()!=null) {
	        if(controlador.getSubforos().containsKey("MP") && controlador.getUsuarios().get(controlador.getUsuarioConectado().getNick()).getRol().equals("estudiante")) {
	        	controlador.getSubforos().get("MP").añadirSubscritor(controlador.getUsuarioConectado());
	        	System.out.println("Te has suscrito satisfactoriamente al subforo de: '" + controlador.getSubforos().get("MP").getTitulo() + "'");
	        }
	        else if(!controlador.getSubforos().containsKey("MP"))
	        	System.out.println("Este subforo no existe");
	        else
	        	System.out.println("No puedes suscribirte al no ser una sesión de tipo 'estudiante'");
        }
        
        Entrada entrada = new TextoPlano(new EntradaGenerica("AYUDA", "Vamos a aprobar MP"), controlador.getUsuarioConectado());
        controlador.crearEntrada("MP", entrada);
        controlador.editarEntrada("MP", entrada, "SIII", "Parece que funciona");
        controlador.Logout(); 
        System.out.println();
        controlador.iniciarSession(usuario1);
        
        /*Pruebas con el primer usuario con 'Rol'='profesor'*/
        
        controlador.registrarUsuario(ejemplo);        
        controlador.CrearSubforo(newsub);
        
        if(controlador.getUsuarioConectado()!=null) {
	        if(controlador.getSubforos().containsKey("MP")&&controlador.getUsuarios().get(controlador.getUsuarioConectado().getNick()).getRol().equals("estudiante")) {
	        	controlador.getSubforos().get("MP").añadirSubscritor(controlador.getUsuarioConectado());
	        	System.out.println("Te has suscrito satisfactoriamente al subforo de: '" + controlador.getSubforos().get("MP").getTitulo() + "'");
	        }
	        else if(!controlador.getSubforos().containsKey("MP"))
	        	System.out.println("Este subforo no existe");
	        else
	        	System.out.println("No puedes suscribirte al no ser una sesión de tipo 'estudiante'");
        }
        
        controlador.editarEntrada("MP", entrada, "SUUU", "He editado una entrada que no es mia.");
        controlador.Logout();     
        System.out.println();
        
        /*Pruebas con un usuario nuevo*/
        
        controlador.registrarUsuario(ejemplo);
        controlador.iniciarSession(ejemplo);
        controlador.CrearSubforo(newsub);
        
        if(controlador.getUsuarioConectado()!=null) {
	        if(controlador.getSubforos().containsKey("MP")&&controlador.getUsuarios().get(controlador.getUsuarioConectado().getNick()).getRol().equals("estudiante")) {
	        	controlador.getSubforos().get("MP").añadirSubscritor(controlador.getUsuarioConectado());
	        	System.out.println("Te has suscrito satisfactoriamente al subforo de: '" + controlador.getSubforos().get("MP").getTitulo() + "'");
	        }
	        else if(!controlador.getSubforos().containsKey("MP"))
	        	System.out.println("Este subforo no existe");
	        else
	        	System.out.println("No puedes suscribirte al no ser una sesión de tipo 'estudiante'");
        }
        
        controlador.Logout();
        System.out.println();
        controlador.iniciarSession(usuario1);
        
        if(controlador.getUsuarioConectado()!=null && controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().comentar("Me parece buena la idea")) {
        	System.out.println("Has comentado la entrada correctamente.");
        }
        else
        	System.out.println("No puedes comentar una entrada que no ha sido verificada.");
        
        controlador.Logout();
        System.out.println();
        controlador.iniciarSession(usuario2);
        boolean verificar = true;
        controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().verificar(verificar);
        if(controlador.getUsuarioConectado()!=null && controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().isVerificada()) {
        	System.out.println("Has verificado la entrada satisfactoriamente");
        }
        else
        	System.out.println("Esta entrada ya se encuentra verificada.");
        
        controlador.Logout();
        System.out.println();
        controlador.iniciarSession(usuario1);
        
        if(controlador.getUsuarioConectado()!=null && controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().comentar("Me parece buena la idea")) {
        	System.out.println("Has comentado la entrada correctamente.");
        }
        else
        	System.out.println("No puedes comentar una entrada que no ha sido verificada.");
        
        controlador.Logout();
        System.out.println();
        controlador.iniciarSession(usuario);
        
        if(controlador.getUsuarioConectado()!=null && controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().votar(1)) {
        	System.out.println("Has votado la entrada correctamente.");
        }
        else
        	System.out.println("No puedes puntuar una entrada que no ha sido verificada.");

    }
}
