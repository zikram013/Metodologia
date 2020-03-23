package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        InterfazUsuario iu=new InterfazUsuario();
        iu.inicializarMenu(Usuario.getInstanciausuario(),SubForo.getInstanciaSubForo());
    }
}
