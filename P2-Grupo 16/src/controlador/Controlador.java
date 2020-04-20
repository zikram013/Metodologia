package controlador;

import modelo.Estudiante;
import modelo.Profesor;
import modelo.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {

    private List<Usuario> usuarios = new ArrayList<>();
    private Estudiante estudiante;

    public void guardarUsuario(Usuario u){
        while (u != null && !usuarios.contains(u)){
            usuarios.add(u);
            System.out.println("El usuario: "+u.getNick() + " ha sido registrado con éxito");
        }

    }

    public void listaUsuarios(){
        for(int i = 0; i < usuarios.size(); i++){
            System.out.println(usuarios.get(i).toString());
        }
    }


    public void borrarUsario(Usuario u){
        if(u == null){
            System.out.println("El usuario introducido no es correcto");
        }
        for(int i = 0; i < usuarios.size(); i++ ){
            if(usuarios.get(i) == u){
                usuarios.remove(i);
                System.out.println("El usuario" + u.getNick() + "ha sido eliminado");
            }
        }
    }

    public void iniciarSession(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nick: ");
        String nickName = sc.nextLine();
        System.out.println("Introduce tu contraseña: ");
        String password = sc.nextLine();
        try{
            for(int i = 0; i < usuarios.size(); i++){
                if (nickName.equals(usuarios.get(i).getNick()) && password.equals(usuarios.get(i).getContraseña())){
                    System.out.println("Ha iniciado sesión correctamente");
                }else{
                    System.out.println("usuario no se encuentra registrado");
                }
            }
        }catch (Exception e){
            System.out.println("Errror en el servidor "+ e.getLocalizedMessage());
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
            usuarios.add(profesor);
        }else if(email.equals("alumnos.urjc.es")){
            Usuario estudiante = new Estudiante(nombre, apellidos, nick, email, contraseña, "estudiante");
            usuarios.add(estudiante);
        }else{
            System.out.println("Los datos introducidos son erroneos. Porfavor revisalos y vuela a intentarlo");
        }
    }
}