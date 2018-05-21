package semaforostate;

import state.State;

public class semaforovermelho implements State {

    @Override
    public State mudarparaamarelo() {
        return null;
    }

    @Override
    public State mudarparavermelho() {
        return null;
    }

    @Override
    public State mudarparaverde(){
        System.out.println("Semáforo Verde");
        return new semaforoverde();
    }
}
