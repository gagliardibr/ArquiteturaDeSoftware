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
public class ProjetoEletronico {
    
    private String nome;
    private final ArrayList<IEquipamento> Projetos = new ArrayList<>();

    public ProjetoEletronico(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<IEquipamento> getProjetos() {
        return Projetos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void getInfo(){
        System.out.println("Projeto " + this.nome);
        
        for (IEquipamento ProjetoEletronico : getProjetos()) {
            ProjetoEletronico.getInfo();
        }
 
    }

   
   

}
