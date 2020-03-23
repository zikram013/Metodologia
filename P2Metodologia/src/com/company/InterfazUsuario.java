package com.company;

import java.awt.*;
import java.io.IOException;
import java.net.StandardSocketOptions;
import java.util.Scanner;

public class InterfazUsuario {

    private Escaner escaner;

    public InterfazUsuario(){
        escaner=new Escaner();
    }

    public void inicializarMenu(Usuario usuario,SubForo subForo,Entrada entrada){
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
                        crearSubforos(usuario,subForo);
                        break;
                    case 3:
                        crearUsuario(usuario);
                        break;
                    case 4:
                        crearEntrada(entrada);
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
        System.out.println("4-Crear Entrada");
    }

    public void mostrarSubforo(){
        ManagerSubForos manager=new ManagerSubForos();
        System.out.println("Mostrar SubForos");
        manager.mostrarSubForo();
    }

    private void crearSubforos(Usuario usuario, SubForo subForo) throws IOException {
        //Deberemos pedir el correo y contraseña de profesor
        ManagerSubForos manager=new ManagerSubForos();
       // String correo=null;
       // String password=null;
        String tituloDelForo=null;
       // correo=escaner.escanerString();
       // password=escaner.escanerString();
        tituloDelForo=escaner.escanerString();

        if(tituloDelForo.equals("")){
            System.out.println("El nombre del foro no puede estar vacio");
        }

        //if(correo.equals(usuario.getCorreo()) && password.equals(usuario.getContraseña())){
           // if(usuario.getRol().equals("profesor")){
                //if(manager.crearSubforos(new SubForo(tituloDelForo))){

                    manager.crearSubforos(subForo);
                    System.out.println("Sub Foro creado satisfactoriamente");
               // }
           // }
       // }else{
           // System.out.println("No se ha podido añadir porque la contraseña o el correo no se corresponden con el de un profesor");
       // }

    }

    private void crearUsuario(Usuario usuario) throws IOException {
        ManagerUsuario managerUsuario = new ManagerUsuario();
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

        private void crearEntrada(Entrada entrada) {

        }



}
