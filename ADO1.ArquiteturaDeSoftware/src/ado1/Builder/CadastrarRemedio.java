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
public class CadastrarRemedio {

    public static void main(String[] args) {
        Remedio famacia = FarmaciaBuilder.builder()
                .nome("Dipiróna")
                .marca("Teuto")
                .dataValidade(20, 3, 2019)
                .quantidade(25)
                .get();

        System.out.println(famacia.toString());

        Remedio hospital = HospitalBuilder.builder()
                .nome("Hibuprofeno")
                .marca("EMS")
                .dataValidade(25, 5, 2020)
                .quantidade(10)
                .get();

        System.out.println(hospital.toString());
    }
}
