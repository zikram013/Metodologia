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

    public void inicializarMenu(Usuario usuario,SubForo subForo){
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
    }

    public void mostrarSubforo(){
        ManagerSubForos manager=new ManagerSubForos();
        System.out.println("SubForos creados");
        manager.mostrarSubForo();
    }

    private void crearSubforos(Usuario usuario, SubForo subForo) throws IOException {
        //Deberemos pedir el correo y contraseña de profesor
        ManagerSubForos manager=new ManagerSubForos();
        String correo=null;
        String password=null;
        String tituloDelForo=null;
        correo=escaner.escanerString();
        password=escaner.escanerString();
        tituloDelForo=escaner.escanerString();

        if(correo.equals(usuario.getCorreo()) && password.equals(usuario.getContraseña())){
            if(usuario.getRol().equals("profesor")){
                if(manager.crearSubforos(new SubForo(tituloDelForo))){
                    System.out.println("Sub Foro creado satisfactoriamente");
                    manager.mostrarSubForo();
                }
            }
        }else{
            System.out.println("No se ha podido añadir porque la contraseña o el correo no se corresponden con el de un profesor");
        }

    }


}
