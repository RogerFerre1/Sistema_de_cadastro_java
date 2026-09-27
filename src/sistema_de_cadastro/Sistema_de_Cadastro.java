/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_de_cadastro;

import java.io.FileWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
/**
 *
 * @author Rogin
 */
public class Sistema_de_Cadastro {
    
    static Pessoa[] pessoa = new Pessoa[100];
    static int total_pessoas = 0;
    
    static void salvarArquivo(){
        try{
            FileWriter arquivo = new FileWriter("clientes.txt");
            
            for(int i = 0; i < total_pessoas; i++){
                arquivo.write(Sistema_de_Cadastro.pessoa[i].nome + "\n");
                arquivo.write(Sistema_de_Cadastro.pessoa[i].cpf + "\n");
                arquivo.write(Sistema_de_Cadastro.pessoa[i].telefone + "\n");
                arquivo.write(Sistema_de_Cadastro.pessoa[i].email + "\n");
            }
            
            arquivo.close();
        } catch(Exception e){
            System.out.println("Erro ao salvar o arquivo.");
        }
    }
    
    static void carregarArquivo(){
        try{
            BufferedReader arquivo = new BufferedReader(new FileReader("clientes.txt"));
            
            String linhaNome;
            
            while((linhaNome = arquivo.readLine()) != null){
                
                String linhaCpf = arquivo.readLine();
                String linhaTelefone = arquivo.readLine();
                String linhaEmail = arquivo.readLine();
                
                Pessoa novaPessoa = new Pessoa();
                
                novaPessoa.nome = linhaNome;
                novaPessoa.cpf = linhaCpf;
                novaPessoa.telefone = linhaTelefone;
                novaPessoa.email = linhaEmail;
                
                pessoa[total_pessoas] = novaPessoa;
                
                total_pessoas++;
            }
            
            arquivo.close();
            
        } catch(FileNotFoundException e){
            
        }catch(Exception e){
            System.out.println("Erro ao carregar o arquivo");
        }
    }
    
    public static void main(String[] args) {
        carregarArquivo();
        
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
