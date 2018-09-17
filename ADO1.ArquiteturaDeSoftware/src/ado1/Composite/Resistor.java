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
public class Resistor extends Equipamento {

    private String tipoResistor;

    public Resistor(String tipoResistor, String nome) {
        super(nome);
        this.tipoResistor = tipoResistor;
    }

   public String getTipoResistor() {
        return tipoResistor;
    }

    public void setTipoResistor(String tipoResistor) {
        this.tipoResistor = tipoResistor;
    }
    
    @Override
    public void getInfo() {
        System.out.println("Resistor: " + super.getNome() + " " +  this.getTipoResistor());
    }

    
}
