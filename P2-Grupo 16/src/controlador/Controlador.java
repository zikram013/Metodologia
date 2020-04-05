package controlador;

import modelo.Estudiante;
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

        for(int i = 0; i < usuarios.size(); i++){
            if (nickName.equals(usuarios.get(i).getNick()) && password.equals(usuarios.get(i).getContraseña())){
                System.out.println("Ha iniciado sesión correctamente");
            }else{
                System.out.println("usuario no se encuentra registrado");
            }
        }
    }
}