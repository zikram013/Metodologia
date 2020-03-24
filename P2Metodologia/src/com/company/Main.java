package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Usuario usuario=new Usuario("marcos","sanchez","zikram","hola","pass","profesor");
        SubForo foro=new SubForo("Prueba");
        SubForo foro2=new SubForo("Prueba2");
        Texto texto=new Texto("Hi all","Como esta ustedes");
        ManagerSubForos managerSubForos=new ManagerSubForos();
        ManagerUsuario managerUsuario=new ManagerUsuario();
        managerSubForos.crearSubforos(foro);
        managerUsuario.crearUsuario(usuario);
        managerSubForos.crearSubforos(foro2);
        foro2.crearEntrada(texto);
        InterfazUsuario iu=new InterfazUsuario(managerSubForos,managerUsuario);
        iu.inicializarMenu(Usuario.getInstanciausuario());

    }
}
