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
public class Capacitor extends Equipamento {

    
    private String tipoCapacitor;

    public Capacitor(String tipoCapacitor, String nome) {
        super(nome);
        this.tipoCapacitor = tipoCapacitor;
    }

  public String getTipoCapacitor() {
        return tipoCapacitor;
    }

    public void setTipoCapacitor(String tipoCapacitor) {
        this.tipoCapacitor = tipoCapacitor;
    }

    @Override
    public void getInfo() {
        System.out.println("Capacitor: " + super.getNome() + " " +  this.getTipoCapacitor());
    }
    
}
