/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1.Singleton;

/**
 *
 * @author brunagagliardi
 */
public class ExemploSingleton {
    public static void main(String[] args) {
        
        UserPreferences.dataAcesso = "11/09/2018";
        UserPreferences.ip = "10510";
        UserPreferences.nome = "Bruna Gagliardi";
        UserPreferences.senha = "******";
        
        UserPreferences.mostrarDadosSessao();
    }
}
