/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoblacklist;

import java.util.ArrayList;

/**
 *
 * @author douglas.ssilva72
 */
public class BlackList {
    
    private ArrayList<String> pessoas = new ArrayList<String>();
        
    public void adicionar(String pessoa){
        pessoas.add(pessoa);
    }
    
    public void listar() {
        
        for (int i = 0; i < pessoas.size(); i++) {
            String pegar = pessoas.get(i);
            System.out.println((i + 1) + " - " + pegar);
        }
    }
    
    public void remover(int posicao) {
        pessoas.remove(posicao-1);
    }
    
    public void alterar(int posicao, String pessoa){
        pessoas.set(posicao-1, pessoa);
    }
    
}
