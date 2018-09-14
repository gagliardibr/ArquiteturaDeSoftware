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
public class Capacitor extends Eletronicos {

    private String tipoCapcitor;

    public Capacitor(String nome) {
        super(nome);
        this.tipoCapcitor = tipoCapcitor;
    }

    public String getTipoCapcitor() {
        return tipoCapcitor;
    }

    public void setTipoCapcitor(String tipoCapcitor) {
        this.tipoCapcitor = tipoCapcitor;
    }
    
      @Override
    public void getInfo() {
        System.out.println("Chip: " + super.getEquipamento() + " " + this.getTipoCapcitor());
    }

}
