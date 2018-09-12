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
public class UserPreferences {

    private UserPreferences(){
        
    }
    
    public static String nome = "";
    public static String senha = "";
    public static String dataAcesso = "";
    public static String ip = "";
    
    public static void mostrarDadosSessao(){
        System.out.println("Nome: " + nome);
        System.out.println("Senha: " + senha);
        System.out.println("Data Acesso: " + dataAcesso);
        System.out.println("IP: " + ip);
    
    }
}
