package mariostate;

import state.State;

public class SuperMario implements State {

    @Override
    public State pegarCogumelo(){
        System.out.println("Pegou um cogumelo: Mais 1000 pontos");
        return this;
    }


}
