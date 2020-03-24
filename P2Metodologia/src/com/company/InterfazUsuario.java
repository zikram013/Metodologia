package com.company;

import java.awt.*;
import java.io.IOException;
import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Scanner;

public class InterfazUsuario {

    private ManagerSubForos manager;
    private ManagerUsuario managerUsuario;
    private ArrayList<Usuario>usuario;
    private Escaner escaner;

    public InterfazUsuario(ManagerSubForos manager,ManagerUsuario managerUsuario){
        this.manager=manager;
        this.managerUsuario=managerUsuario;
        escaner=new Escaner();
        this.usuario=new ArrayList<>();
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void inicializarMenu(Usuario usuario){
        try{
            int opcion=1;
            do{
                mostrarMenu();
                opcion=escaner.escanerInt();
                switch (opcion){
                    case 1:
                        mostrarSubforo();
                        break;
                    case 2:
                        crearSubforosInterfaz();
                        break;
                    case 3:
                        crearUsuario();
                        break;
                    case 4:
                            mostrarUsuario();
                            break;
                    case 5:
                        //crearEntrada(entrada);
                        break;
                }
            }while(opcion !=0);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }




    public void mostrarMenu(){
        System.out.println("0-Salir");
        System.out.println("1-mostrarSubforos");
        System.out.println("2-crear subForo");
        System.out.println("3-Crear Usuario");
        System.out.println("4-Mostrar usuario");
        System.out.println("5-Crear Entrada");
    }

    public void mostrarSubforo(){

        System.out.println("Mostrar SubForos");
        manager.mostrarSubForo();
    }

    private void crearSubforosInterfaz() throws IOException {

        String correo=null;
        String password=null;
        String tituloDelForo=null;
        System.out.println("Introduzca el correo");
        correo=escaner.escanerString();
        System.out.println("Introduzca la contraseña");
        password=escaner.escanerString();

   ;
          if(managerUsuario.encontrado(correo,password)){
              System.out.println("Introduzca el nombre del foro");
              tituloDelForo=escaner.escanerString();
              SubForo subForo=new SubForo(tituloDelForo);
              if(tituloDelForo.equals("")){
                  System.out.println("El nombre del foro no puede estar vacio");
              }else{
                  manager.crearSubforos(subForo);
                  System.out.println("Sub Foro creado satisfactoriamente");
              }
          }else {
              System.out.println("no se puede crear");
          }

    }


    private void crearUsuario() throws IOException {
        //Pedimos todos los datos al usuario
        System.out.println("Introduzca el nombre");
        String nombre = escaner.escanerString();
        System.out.println("Introduzca los apellidos");
        String apellidos = escaner.escanerString();
        System.out.println("Introduzca el nick");
        String nick = escaner.escanerString();
        System.out.println("Introduzca el correo");
        String correo = escaner.escanerString();
        System.out.println("Introduzca la contraseña");
        String contraseña = escaner.escanerString();
        System.out.println("Introduzca el rol");
        String rol = escaner.escanerString();


        if (!(rol.equals("profesor") || rol.equals("Profesor") || rol.equals("usuario") || rol.equals("Usuario"))) {
            System.out.println("El rol seleccionado no es valido");
        }

        if (managerUsuario.crearUsuario(new Usuario(nombre, apellidos, nick, correo, contraseña, rol))) {
            System.out.println("Usuario creado satisfactoriamente");
        } else {
            System.out.println("No se ha podido crear");
        }
    }

    private void mostrarUsuario() {
        System.out.println("Mostrar Usuarios");
        managerUsuario.listarUsuarios();
    }
        private void crearEntrada(Entrada entrada) {

        }



}
