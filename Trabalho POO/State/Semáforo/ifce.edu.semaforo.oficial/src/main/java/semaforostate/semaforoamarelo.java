package semaforostate;

import state.State;

public class semaforoamarelo implements State {

    @Override
    public State mudarparaamarelo() {
        return null;
    }

    @Override
    public State  mudarparavermelho(){
        System.out.println("Semáforo Vermelho");
        return new semaforovermelho();
    }

    @Override
    public State mudarparaverde() {
        return null;
    }

}
