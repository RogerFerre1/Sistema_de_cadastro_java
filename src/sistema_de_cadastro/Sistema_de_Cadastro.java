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
    
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[100];
        int total_pessoas = 0;
        
        pessoa[total_pessoas] = new Pessoa();
        pessoa[total_pessoas].nome = "Rogin";
        pessoa[total_pessoas].cpf = "O mais brabo";
        total_pessoas++;
        
        System.out.println(pessoa[0].nome);
        
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
