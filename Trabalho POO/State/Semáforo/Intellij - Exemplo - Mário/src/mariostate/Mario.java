package mariostate;

import state.State;

public class Mario implements State {

    @Override
    public State pegarCogumelo() {
        System.out.println("Pegou um cogumelo: Tornou-se Super Mario");
        return new SuperMario();

    }

    @Override
    public State pegarEstrela() {
        System.out.println("Pegou uma estrela: Mario está invencivel");
        return new MarioInvencivel();

    }

    @Override
    public State pegarflordeFogo() {
        System.out.println("Pegou uma flor: Mario atira fogo");
        return new FireMario();

    }

    @Override
    public State colidirComInimigo() {
        System.out.println("Colidiu com um inimigo: Mario morre");
        return new MarioMorto();

    }

    @Override
    public String retornarTipo() {
        return "Mario Comum";

    }
}
