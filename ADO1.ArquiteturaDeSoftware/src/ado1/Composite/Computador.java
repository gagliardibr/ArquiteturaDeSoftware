/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1.Composite;

import java.util.ArrayList;

/**
 *
 * @author brunagagliardi
 */
public class Computador extends Equipamento {

    
    private final ArrayList<IEquipamento> Computador  = new ArrayList<>();

    public Computador(String nome) {
        super(nome);
    }

    public ArrayList<IEquipamento> getComputador() {
        return Computador;
    }
    
    @Override
    public void getInfo() {
        
        System.out.println("Computador: " + super.getNome());
        
        for (IEquipamento computador : getComputador()) {
            computador.getInfo();
        }
        
    }

    
    
    
}
