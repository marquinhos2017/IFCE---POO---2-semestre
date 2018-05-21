package com.company;

import semaforostate.Semaforo;
import state.State;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        State semaforo = new Semaforo();

        while(0<1){

            semaforo = semaforo.mudarparaamarelo();     SECONDS.sleep(5);
            semaforo = semaforo.mudarparavermelho();    SECONDS.sleep(25);
            semaforo = semaforo.mudarparaverde();       SECONDS.sleep(25);


        }
    }
}
