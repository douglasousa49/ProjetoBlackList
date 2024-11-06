/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoblacklist;

import java.util.Scanner;

/**
 *
 * @author douglas.ssilva72
 */
public class EntradaDados {

    static Scanner ler = new Scanner(System.in);

    public void Perguntar(String msg) {
        System.out.println(msg);
    }

    public void exibir(String x, int y) {
        System.out.println(x + "" + y);
    }
    
    public String lerTexto() {
        return ler.nextLine();
    }

    public int lerInt() {

        while (true) {
            var linha = ler.nextLine();
            try {
                return Integer.parseInt(linha);

            } catch (NumberFormatException erro) {

                System.out.println("Digite um número inteiro.");
            }
        }
    }

    public double lerDouble() {
        
        while (true) {
            var linha = ler.nextLine();
            try {
                return Double.parseDouble(linha);
                
            } catch (NumberFormatException erro) {
                
                System.out.println("Digite um número válido.");
            }
        }
    }
}