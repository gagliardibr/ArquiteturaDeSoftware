/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1.Builder;

import java.util.Date;
import java.util.List;

/**
 *
 * @author brunagagliardi
 */
public class Hospital implements Remedio {

    private String nomeRemedio;
    private String marca;
    private int quantidade;
    private Date dataValidade;

    //Gerar os métodos getters para cada atributo.
    @Override
    public void setNome(String autor) {
        this.nomeRemedio = autor;
    }

    @Override
    public void setMarca(String titulo) {
        this.marca = titulo;
    }


    @Override
    public void setQuantidade(int paginas) {
        this.quantidade = paginas;
    }

    @Override
    public void setDataValidade(Date data) {
        this.dataValidade = data;
    }


    @Override
    public String toString() {
        return "Hospital{"
                + "Nome Remédio='" + nomeRemedio + '\''
                + ", Laboratório='" + marca + '\''
                + ", Quantidade=" + quantidade
                + ", Data Validade=" + dataValidade
                + '}';
    }
}
