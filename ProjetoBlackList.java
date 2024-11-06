/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoblacklist;

/**
 *
 * @author douglas.ssilva72
 */
public class ProjetoBlackList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntradaDados entrada = new EntradaDados();
        BlackList lista = new BlackList();

        while (true) {

            System.out.println("===== MENU =====");
            System.out.println("1 - Novo");
            System.out.println("2 - Alterar");
            System.out.println("3 - Exibir");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");

            int escolha = entrada.lerInt();

            switch (escolha) {

                case 1:
                    System.out.println("Digite o nome da pessoa:");
                    String nome = entrada.lerTexto();
                    lista.adicionar(nome);
                    System.out.println("Pessoa adicionada na lista");
                    break;

                case 2:
                    System.out.println("Digite a posicao da pessoa para alterar:");
                    int posicao = entrada.lerInt();
                    
                    System.out.println("Digite o novo nome:");
                    String novoNome = entrada.lerTexto();
                    
                    lista.alterar(posicao, novoNome);

                case 3:
                    System.out.println("===== Lista de Pessoas =====");
                    System.out.println("");
                    lista.listar();
                    break;

                case 4:
                        System.out.println("Digite o numero da pessoa a ser removida:");
                        int numero = entrada.lerInt();
                        lista.remover(numero);
                        break;

                case 0:
                    return;

                default:
                    System.out.println("Escolha invalida.");
            }
        }
    }
}    