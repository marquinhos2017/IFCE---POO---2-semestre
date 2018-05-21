/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import br.com.dominio.state.State;

package br.com.dominio.semaforostate;

/**
 *
 * @author Marcos Rodrigues
 */
public class SemaforoAmarelo implements State {
    public State ficarVermelho(){
        System.out.println("Vermelho");
        return SemaforoVermelho;
    }

    
}


