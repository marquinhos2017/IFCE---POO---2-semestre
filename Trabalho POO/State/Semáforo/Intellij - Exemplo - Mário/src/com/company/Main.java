package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        State mario = new Mario;

        mario = mario.pegarCogumelo();
        mario = mario.pegarflordeFogo();
        mario = mario.pegarCogumelo();

        mario = mario.colidirComInimigo();
        mario = mario.colidirComInimigo();
        mario = mario.colidirComInimigo();

        System.out.println();
        System.out.println("Estado final: " + mario.retornarTipo());

    }
}
