package semaforostate;

import state.State;

public class semaforoverde implements State {

    @Override
    public State mudarparaamarelo(){
        System.out.println("Semáforo Amarelo");
        return new semaforoamarelo();
    }

    @Override
    public State mudarparavermelho() {
        return null;
    }

    @Override
    public State mudarparaverde() {
        return null;
    }

}
