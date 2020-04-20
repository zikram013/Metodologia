package controlador;

import modelo.Estudiante;
import modelo.Profesor;
import modelo.Usuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Controlador {

    //private List<Usuario> usuarios = new ArrayList<>();
    private Estudiante estudiante;

    HashMap<String, Usuario> usuarios = new HashMap<>();

    public void guardarUsuario(Usuario u){
    	if(!usuarios.containsKey(u.getEmail())) {
	        usuarios.put(u.getEmail(), u);
	        System.out.println("El usuario: "+u.getNick() + " ha sido registrado con éxito");
    	}

    }

    public void listaUsuarios(){
    	System.out.println("Usuarios del sistema: ");
    	for (String email: usuarios.keySet()){
    		System.out.print("Correo: " + email.toString() + " Contraseña: " + usuarios.get(email).getContraseña() + "\n");
    	}
    }


    public void borrarUsario(Usuario u){
        if(u != null){
        	usuarios.remove(u.getEmail());
            System.out.println("Usuario eliminadoo");
        }
        else
        	System.out.println("El usuario introducido no es correcto");
    }

    public void iniciarSession(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu email: ");
        String email = sc.nextLine();
        System.out.println("Introduce tu contraseña: ");
        String password = sc.nextLine();
        try{
            if(usuarios.containsKey(email)&&(usuarios.get(email).getContraseña().equals(password)))
            	System.out.println("Acabas de iniciar sesión como: " + usuarios.get(email).getNick());
            else if(usuarios.containsKey(email)&&(!usuarios.get(email).getContraseña().equals(password)))
            	System.out.println("Contraseña incorrecta");
            else
                System.out.println("El usuario no se encuentra registrado");
        }catch (Exception e){
            System.out.println("Error en el servidor "+ e.getLocalizedMessage());
        }

    }

    public void registrarUsuario(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tus apellidos: ");
        String apellidos = sc.nextLine();
        System.out.println("Introduce tu nick: ");
        String nick = sc.nextLine();
        System.out.println("Introduce tu email: ");
        String email = sc.nextLine();
        System.out.println("Introduce tu contraseña: ");
        String contraseña = sc.nextLine();


        String[] parts = email.split("@");
        String part1 = parts[0];
        String part2 = parts[1];
        if(email.equals("urjc.es")){
            Usuario profesor = new Profesor(nombre, apellidos, nick, email, contraseña, "profesor");
            usuarios.put(profesor.getEmail(), profesor);
        }else if(email.equals("alumnos.urjc.es")){
            Usuario estudiante = new Estudiante(nombre, apellidos, nick, email, contraseña, "estudiante");
            usuarios.put(estudiante.getEmail(), estudiante);
        }else{
            System.out.println("Los datos introducidos son erroneos. Porfavor revisalos y vuela a intentarlo");
        }
    }
}