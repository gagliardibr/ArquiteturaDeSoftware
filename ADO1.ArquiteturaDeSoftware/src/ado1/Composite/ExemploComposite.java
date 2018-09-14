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
    
    public static void main(String[] args){
    
        ProjetoEquipamento proj = new ProjetoEquipamento("Computador");
        
        proj.getProjetos().add(new Capacitor(""));
        
        
        
        
        proj.getInfo();
    }
}
