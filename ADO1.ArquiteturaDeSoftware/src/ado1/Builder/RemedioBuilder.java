/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1.Builder;

/**
 *
 * @author brunagagliardi
 */
public interface RemedioBuilder {

    RemedioBuilder nome(String autor);

    RemedioBuilder marca(String titulo);

    RemedioBuilder quantidade(int total);

    RemedioBuilder dataValidade(int dia, int mes, int ano);

    Remedio get();
}
