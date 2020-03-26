package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Usuario usuario=new Usuario("marcos","sanchez","zikram","hola","pass","profesor");
        SubForo foro=new SubForo("Prueba");
        SubForo foro2=new SubForo("Prueba2");
        Entrada entrada=new Entrada("Hi all", "Como esta ustedes");
        ManagerSubForos managerSubForos=new ManagerSubForos();
        ManagerUsuario managerUsuario=new ManagerUsuario();
        managerSubForos.crearSubforos(foro);
        managerUsuario.crearUsuario(usuario);
        managerSubForos.crearSubforos(foro2);
       // foro.crearEntrada("Prueba",entrada);
        //SubForo foro3=new SubForo("Foro");
        //managerSubForos.crearSubforos(foro3);
        InterfazUsuario iu=new InterfazUsuario(managerSubForos,managerUsuario);
        iu.inicializarMenu(Usuario.getInstanciausuario());


    }
}
