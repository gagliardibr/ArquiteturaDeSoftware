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
public class ProjetoEquipamento {
    private String nome;
    private ArrayList<IEletronicos> projetos = new ArrayList<>();

    public ProjetoEquipamento(String nome) {
        this.nome = nome;
    }

   public ArrayList<IEletronicos> getProjetos() {
        return projetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void getInfo(){
        System.out.println("Projeto " + this.nome);
        
        for (IEletronicos eletronicos : getProjetos()) {
            eletronicos.getInfo();
        }
 
    }
}
