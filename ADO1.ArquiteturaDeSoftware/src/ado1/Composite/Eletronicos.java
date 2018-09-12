/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1.Composite;

/**
 *
 * @author brunagagliardi
 */
public abstract class Eletronicos implements IEletronicos{
    
    private String equipamento;
    
    public Eletronicos(String nome) {
        this.equipamento = equipamento;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
    
        
    
}
