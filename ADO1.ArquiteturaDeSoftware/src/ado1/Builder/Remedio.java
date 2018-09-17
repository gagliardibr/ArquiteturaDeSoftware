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
public interface Remedio {

    void setNome(String nome);

    void setMarca(String nome);

    void setQuantidade(int paginas);

    void setDataValidade(Date data);

    String toString();
}
