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
public class ExemploComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProjetoEletronico projeto = new ProjetoEletronico("Computador");
        
        projeto.getProjetos().add(new Capacitor("Marca 1", "Capacitor 1"));
        projeto.getProjetos().add(new Chip("Marca 2", "Capacitor 2"));
        projeto.getProjetos().add(new Indutor("Marca 3", "Capacitor 3"));
        projeto.getProjetos().add(new Resistor("Marca 4", "Capacitor 4"));
        
        
        Computador pc = new Computador("Modelo 55");
        pc.getComputador().add(new Chip("modelo 2","Chip 3"));
        
        projeto.getProjetos().add(pc);  
        
        projeto.getInfo();
        
        
    }
    
}
