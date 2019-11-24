/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oeber
 */
public class Linha {
    private List<Integer> numeros;

    public Linha() {
        this.numeros=new ArrayList();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void addNumeros(Integer numero) {
        numeros.add(numero);
    }
    
}
