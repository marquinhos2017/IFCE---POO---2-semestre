/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.dominio.state.State;

package br.com.dominio.semaforostate;

import br.com.dominio.state.State;

/**
 *
 * @author Marcos Rodrigues
 */
public class SemaforoVermelho implements State {
    public State ficarVerde(){
        System.out.println("Verde");
        return SemaforoVerde;
    }
}
