package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Usuario usuario=new Usuario("marcos","sanchez","zikram","hola","pass","profesor");
        SubForo foro=new SubForo("Prueba");
        ManagerSubForos managerSubForos=new ManagerSubForos();
        ManagerUsuario managerUsuario=new ManagerUsuario();
        managerSubForos.crearSubforos(foro);
        managerUsuario.crearUsuario(usuario);
        InterfazUsuario iu=new InterfazUsuario(managerSubForos,managerUsuario);
        iu.inicializarMenu(Usuario.getInstanciausuario());

    }
}
