package view;

import model.Iphone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        Scanner scanner = new Scanner(System.in);

        int opcao  = -1;

        while(opcao != 0){
            System.out.println("MENU DE OPÇÕES DO IPHONE");
            System.out.println("1 - REPRODUZIR MÚSICA");
            System.out.println("2 - PAUSAR MÚSICA");
            System.out.println("3 - SELECIONAR MÚSICA");
            System.out.println("4 - ABRIR NAVEGADOR");
            System.out.println("5 - ABRIR NOVA ABA NO NAVEGADOR");
            System.out.println("6 - ATUALIZAR NAVEGADOR");
            System.out.println("7 - FAZER LIGAÇÃO");
            System.out.println("8 - ATENDER LIGAÇÃO");
            System.out.println("9 - ACESSAR CAIXA POSTAL");
            System.out.println("0 - SAIR");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    iphone.reproduzirMusica();
                    break;
                case 2:
                    iphone.pausarMusica();
                    break;
                case 3:
                    iphone.selecionarMusica();
                    break;
                case 4:
                    iphone.exibirPagina();
                    break;
                case 5:
                    iphone.adicionarNovaAba();
                    break;
                case 6:
                    iphone.atualizarPagina();
                    break;
                case 7:
                    iphone.fazerLigacao();
                    break;
                case 8:
                    iphone.atenderLigacao();
                    break;
                case 9:
                    iphone.acessarCaixaPostal();
                    break;
                case 0:
                    System.out.println("Iphone encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
