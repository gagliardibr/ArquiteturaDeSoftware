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
public class Chip extends Eletronicos {

    private String tipoChip;

    public Chip(String nome) {
        super(nome);
        this.tipoChip = tipoChip;
    }

    public String getTipoChip() {
        return tipoChip;
    }

    public void setTipoChip(String tipoChip) {
        this.tipoChip = tipoChip;
    }
    
     @Override
    public void getInfo() {
        System.out.println("Chip: " + super.getEquipamento() + " " + this.tipoChip);
    }
    

}
