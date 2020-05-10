import java.util.ArrayList;
import java.util.List;
import controlador.Controlador;
import modelo.Admin;
import modelo.Entrada;
import modelo.EntradaGenerica;
import modelo.Estudiante;
import modelo.Profesor;
import modelo.SubForo;
import modelo.TextoPlano;
import modelo.Usuario;

public class Main {

    public static  Controlador controlador = new Controlador();
    public static void main (String[] arg){

        Usuario usuario = new Estudiante("Angel", "Chino", "el chino", "angel@alumnos.urjc.es", "chino","estudiante");
        Usuario usuario1 = new Profesor("Ramon", "Barrabes", "ramon1", "ramon@urjc.es", "1234","profesor");
        Usuario usuario2 = new Admin("David", "Amor", "almendra", "almendra@admin.urjc.es", "nose","admin");
        Profesor ejemplo = new Profesor("Antonio", "Gonzalez", "el profe nuevo", "antonio.gpardo@urjc.es", "1234","profesor");
        Profesor ejemplo2 = new Profesor("Gustavo", "Cebrian", "altoke", "gustavo.cebrian@urjc.es", "1234","profesor");
        SubForo sub = new SubForo("MP");
        SubForo newsub = new SubForo("DAW");

        controlador.registrarUsuario(usuario);
        controlador.registrarUsuario(usuario1);
        controlador.registrarUsuario(usuario2);
        
        System.out.println();   
        
        controlador.getSubforos().put(sub.getTitulo(), sub);
        controlador.listaUsuarios();
        
        System.out.println();
        
        /*Pruebas con el primer usuario con 'Rol'='estudiante'*/
        controlador.iniciarSession(usuario);
        
        /*Mostramos la entrada mas votada de cada subforo*/
        List<Entrada> entradas = new ArrayList<Entrada>();
        entradas = controlador.entradasMasVotadas();
        if(entradas.size()!=0) {
        	System.out.println("Las entradas mas votadas son:\n");
	        for(int i = 0; i < entradas.size(); i++)
	        	entradas.get(i).toString();
        }
        else
        	System.out.println("No hay entradas votadas.");
        
        /*Intentamos crear un usuario sin cerrar la sesi�n*/
        controlador.registrarUsuario(ejemplo); 
        
        /*Intentamos crear un subforo con una sesion de tipo 'estudiante'*/
        controlador.CrearSubforo(sub);
        
        /*Nos suscribimos al subforo de 'MP'*/
        if(controlador.getUsuarioConectado()!=null) {
	        if(controlador.getSubforos().containsKey("MP") && controlador.getUsuarios().get(controlador.getUsuarioConectado().getNick()).getRol().equals("estudiante")) {
	        	controlador.getSubforos().get("MP").annadirSubscritor(controlador.getUsuarioConectado());
	        }
	        else if(!controlador.getSubforos().containsKey("MP"))
	        	System.out.println("Este subforo no existe");
	        else
	        	System.out.println("No puedes suscribirte al no ser una sesion de tipo 'estudiante'");
        }
        
        /*Creamos una nueva entrada*/
        Entrada entrada = new TextoPlano(new EntradaGenerica("AYUDA", "Vamos a aprobar MP"), controlador.getUsuarioConectado());
        controlador.crearEntrada("MP", entrada);
        
        /*Editamos la entrada*/
        controlador.editarEntrada("MP", entrada, "SIII", "Parece que funciona");
        controlador.Logout(); 
        System.out.println();
        
        /*Pruebas con el primer usuario con 'Rol'='profesor'*/
        controlador.iniciarSession(usuario1);
        
        controlador.registrarUsuario(ejemplo);     
        
        /*Creamos un nuevo subforo*/
        controlador.CrearSubforo(newsub);
        
        /*Intentamos suscribirnos a un subforo siendo un profesor*/
        if(controlador.getUsuarioConectado()!=null) {
	        if(controlador.getSubforos().containsKey("MP")&&controlador.getUsuarios().get(controlador.getUsuarioConectado().getNick()).getRol().equals("estudiante")) {
	        	controlador.getSubforos().get("MP").annadirSubscritor(controlador.getUsuarioConectado());
	        }
	        else if(!controlador.getSubforos().containsKey("MP"))
	        	System.out.println("Este subforo no existe");
	        else
	        	System.out.println("No puedes suscribirte al no ser una sesion de tipo 'estudiante'");
        }
        
        /*Intentamos editar una entrada que no hemos creado*/
        controlador.editarEntrada("MP", entrada, "SUUU", "He editado una entrada que no es mia.");
        controlador.Logout();     
        System.out.println();
        
        /*Pruebas con un usuario nuevo*/
        controlador.registrarUsuario(ejemplo);
        controlador.iniciarSession(ejemplo);
        
        /*Intentamos crear un subforo que ya existe*/
        controlador.CrearSubforo(newsub);
        
        if(controlador.getUsuarioConectado()!=null) {
	        if(controlador.getSubforos().containsKey("MP")&&controlador.getUsuarios().get(controlador.getUsuarioConectado().getNick()).getRol().equals("estudiante")) {
	        	controlador.getSubforos().get("MP").annadirSubscritor(controlador.getUsuarioConectado());
	        }
	        else if(!controlador.getSubforos().containsKey("MP"))
	        	System.out.println("Este subforo no existe");
	        else
	        	System.out.println("No puedes suscribirte al no ser una sesion de tipo 'estudiante'");
        }
        
        /*Mostramos las entradas del subforo de MP, pero al no haber verificado la que creamos en un principio
        no nos muestra ninguna*/
        System.out.println(controlador.getSubforos().get("MP").toStringEntradas());
        
        controlador.Logout();
        System.out.println();
        controlador.iniciarSession(usuario1);
        
        /*Intentamos comentar una entrada que aun no ha sido verificada*/
        if(controlador.getUsuarioConectado()!=null && controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().comentar("Me parece buena la idea")) {
        	System.out.println("Has comentado la entrada correctamente.");
        }
        else
        	System.out.println("No puedes comentar una entrada que no ha sido verificada.");
        
        controlador.Logout();
        System.out.println();
        controlador.iniciarSession(usuario2);
        boolean verificar = true;
        
        /*Verificamos la entrada que habiamos creado*/
        controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().verificar(verificar);
        if(controlador.getUsuarioConectado()!=null && controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().isVerificada()) {
        	System.out.println("Has verificado la entrada satisfactoriamente");
        }
        else
        	System.out.println("Esta entrada ya se encuentra verificada.");
        
        controlador.Logout();
        System.out.println();
        controlador.iniciarSession(usuario1);
        
        /*Comentamos la entrada que ya ha sido verificada*/
        if(controlador.getUsuarioConectado()!=null && controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().comentar("Me parece buena la idea")) {
        	System.out.println("Has comentado la entrada correctamente.");
        }
        else
        	System.out.println("No puedes comentar una entrada que no ha sido verificada.");
        
        controlador.Logout();
        System.out.println();
        
        /*Recibimos una notificacion de la entrada que creamos, como antes no la verificamos, no se envio ninguna notificacion*/
        controlador.iniciarSession(usuario);
        
        /*Mostramos las entradas del subforo de MP*/
        System.out.println(controlador.getSubforos().get("MP").toStringEntradas());
        System.out.println();
        
        /*Intentamos votar nuestra propia entrada*/
        if(controlador.getUsuarioConectado()!=null && !controlador.getSubforos().get("MP").getEntradas().get("SIII").comprobarAutor(controlador.getUsuarioConectado().getNick())) {
        	if(controlador.getUsuarioConectado()!=null && !controlador.getSubforos().get("MP").getEntradas().get("SIII").comprobarAutor(controlador.getUsuarioConectado().getNick()) && controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().votar(1,controlador.getUsuarioConectado())) {
            	System.out.println("Has votado la entrada correctamente.");
            }
            else
            	System.out.println("No puedes puntuar una entrada que no ha sido verificada.");
        }
        else {
        	System.out.println("No puedes puntuar tu propia entrada.");
        }
        
        /*A�adimos un comentario a un comentario de la entrada*/
        controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().getComentarios().get(0).comentar("No estoy de acuerdo con lo que dices");
        
        /*Votamos el comentario de la entrada*/
        if(controlador.getUsuarioConectado()!=null && controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().getComentarios().get(0).votar(-1, controlador.getUsuarioConectado())) {
        	System.out.println("Has votado el comentario correctamente.\n");
        }
        else
        	System.out.println("No puedes votar una entrada que no ha sido verificada.\n");
        
        /*Mostramos otra vez las entradas del subforo con los datos actualizados*/
        System.out.println(controlador.getSubforos().get("MP").toStringEntradas());
        
        System.out.println();
        controlador.Logout();
        System.out.println();
        
        controlador.iniciarSession(ejemplo);
        
        /*Votamos la entrada del subforo con un usuario distinto*/
        if(controlador.getUsuarioConectado()!=null && !controlador.getSubforos().get("MP").getEntradas().get("SIII").comprobarAutor(controlador.getUsuarioConectado().getNick())) {
        	if(controlador.getUsuarioConectado()!=null && !controlador.getSubforos().get("MP").getEntradas().get("SIII").comprobarAutor(controlador.getUsuarioConectado().getNick()) && controlador.getSubforos().get("MP").getEntradas().get("SIII").getEntradaGenerica().votar(1,controlador.getUsuarioConectado())) {
            	System.out.println("Has votado la entrada correctamente.");
            }
            else
            	System.out.println("No puedes puntuar una entrada que no ha sido verificada.");
        }
        else {
        	System.out.println("No puedes puntuar tu propia entrada.");
        }
        
        /*Mostramos la entrada mas votada de cada subforo, antes no habia ninguna, pero al haber puntuado el subforo
         * de MP, ahora se muestra la entrada*/
        entradas = controlador.entradasMasVotadas();
        if(entradas.size()!=0) {
        	System.out.println("Las entradas mas votadas son:\n");
	        for(int i = 0; i < entradas.size(); i++) {
	        	System.out.print(entradas.get(i).toString());
	        	System.out.println("Puntuacion: " + entradas.get(i).getEntradaGenerica().getPuntuacion() + "\n");
	        }
        }
        else
        	System.out.println("No hay entradas votadas.");
        
        controlador.Logout();
        System.out.println();
        controlador.iniciarSession(usuario);
        
        /*Nos desuscribimos de un subforo al que estamos suscritos*/
        if(controlador.getUsuarioConectado()!=null) {
	        if(controlador.getSubforos().containsKey("MP") && controlador.getUsuarios().get(controlador.getUsuarioConectado().getNick()).getRol().equals("estudiante")) {
	        	controlador.getSubforos().get("MP").eliminarSubscritor(controlador.getUsuarioConectado());
	        }
	        else if(!controlador.getSubforos().containsKey("MP"))
	        	System.out.println("Este subforo no existe");
	        else
	        	System.out.println("No puedes desuscribirte al no ser una sesion de tipo 'estudiante'");
        }
        
        controlador.Logout();
        System.out.println();
        controlador.iniciarSession(usuario2);
        
        /*Penalizacion a un usuario*/
        if(controlador.getUsuarioConectado().getRol().equals("admin"))
        	controlador.penalizar("el chino");
        else
        	System.out.println("No puedes penalizar sin ser administrador.");
        
        if(controlador.getUsuarioConectado().getRol().equals("admin"))
        	controlador.penalizar("el chino");
        else
        	System.out.println("No puedes penalizar sin ser administrador.");
        
        controlador.Logout();
        System.out.println();
        
        /*Intentamos iniciar sesion con un usuario que esta penalizado*/
        controlador.iniciarSession(usuario);

        System.out.println();
        controlador.iniciarSession(usuario2);
        
        /*Modificamos la penalizacion de un usuario penalizado*/
        if(controlador.getUsuarioConectado().getRol().equals("admin"))
        	controlador.modificarPenalizacion("el chino", 4);
        else
        	System.out.println("No puedes penalizar sin ser administrador.");
        
        System.out.println();
        
        /*Inicio de sesion despues de cambiar la penalizacion*/
        controlador.iniciarSession(usuario);
        controlador.Logout();

    }
}
