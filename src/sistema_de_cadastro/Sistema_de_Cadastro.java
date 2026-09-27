/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_de_cadastro;

/**
 *
 * @author Rogin
 */
public class Sistema_de_Cadastro {
    
    static Pessoa[] pessoa = new Pessoa[100];
    static int total_pessoas = 0;
    
    public static void main(String[] args) {
        
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
    }
    
    
    static class Pessoa{
            String nome;
            String cpf;
            String telefone;
            String email;
    }
    
}
