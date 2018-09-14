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
public class Indutor extends Eletronicos {

    private String tipoIndutor;

    public Indutor(String nome, String tipoIndutor) {
        super(nome);
        this.tipoIndutor = tipoIndutor;
    }
    
    public String getTipoIndutor() {
        return tipoIndutor;
    }

    public void setTipoIndutor(String tipoIndutor) {
        this.tipoIndutor = tipoIndutor;
    }
    
      @Override
    public void getInfo() {
        System.out.println("Chip: " + super.getEquipamento() + " " + this.getTipoIndutor());
    }

}
