/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dominio.semaforostate;

import br.com.dominio.state.State;

/**
 *
 * @author Marcos Rodrigues
 */
public class SemaforoVerde implements State {
    public State ficarAmarelo(){
        System.out.println("Amarelo");
        return SemaforoAmarelo;
    }
}
