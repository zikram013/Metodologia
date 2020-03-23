package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Usuario usuario=new Usuario("marcos","sanchez","zikram","hola","pass","profesor");
        SubForo foro=new SubForo("Prueba");
        ManagerSubForos managerSubForos=new ManagerSubForos();
        managerSubForos.crearSubforos(foro);
        InterfazUsuario iu=new InterfazUsuario(managerSubForos);
        iu.inicializarMenu(Usuario.getInstanciausuario());

    }
}
