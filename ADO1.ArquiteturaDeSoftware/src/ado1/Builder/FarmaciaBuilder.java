/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1.Builder;

import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author brunagagliardi
 */
public class FarmaciaBuilder implements RemedioBuilder {

    private Remedio remedio;

    public FarmaciaBuilder() {
        this.remedio = new Farmacia();
    }

    public static RemedioBuilder builder() {
        return new FarmaciaBuilder();
    }

    @Override
    public RemedioBuilder nome(String autor) {
        this.remedio.setNome(autor);
        return this;
    }

    @Override
    public RemedioBuilder marca(String titulo) {
        this.remedio.setMarca(titulo);
        return this;
    }


    @Override
    public RemedioBuilder quantidade(int total) {
        this.remedio.setQuantidade(total);
        return this;
    }

    @Override
    public RemedioBuilder dataValidade(int dia, int mes, int ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes, dia);
        this.remedio.setDataValidade(calendar.getTime());
        return this;
    }

    @Override
    public Remedio get() {
        return this.remedio;
    }
}    