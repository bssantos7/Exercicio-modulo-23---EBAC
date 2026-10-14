package com.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Celular celular=new Celular("Sansumg galay", 500, 16, "14 polegadas",false);
        Radio radio=new Radio("Radio JBL", 350, "500w");
        Tablet tablet=new Tablet("Ipad", 1500, 32, "16polegadas", false);
        Televisao televisao=new Televisao("LG", 3500, "77 polegads");
        Videogame videogame = new Videogame("PS5", 4000, "Core i9", 32);
        ArrayList<Produto>lista = new ArrayList<>();
        lista.add(celular);
        lista.add(radio);
        lista.add(tablet);
        lista.add(televisao);
        lista.add(videogame);

        Scanner scanner =new Scanner(System.in);
        

        System.out.println("Bem vindo ao programa");
        System.out.println("Para começar, digite seu nome: ");
        String nome=scanner.nextLine();
        Cliente cliente=new Cliente(nome);

        int continuar=1;
        do{
            System.out.println("Menu");
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Adicionar itens no carrinho");
            System.out.println("2 - finalizar compra");
            System.out.println("0 - Sair do programa");
            continuar=Integer.parseInt(scanner.nextLine());
            switch (continuar) {
                case 1:
                    Produto produtoAtual=null;
                    for(int i=0;i<lista.size();i++){
                        System.out.println("Codigo produto: "+i);
                        produtoAtual=lista.get(i);
                        System.out.println(produtoAtual.toString());
                    }
                    System.out.println("digite o codigo do produto desejado:");
                    int cod = Integer.parseInt(scanner.nextLine());
                    System.out.println("Digite a quantidade desejada: ");
                    int quantidade=Integer.parseInt(scanner.nextLine());
                    cliente.adicionarItem(lista.get(cod), quantidade);
                    continuar=1;
                    break;
                case 2:
                    cliente.calculaTotal();
                    continuar=1;
                    break;
                case 0:
                    System.out.println("Fim do programa");
                    continuar=0;
                    break;
                default:
                    System.out.println("Numero invalido. tente novamente");
                    break;
            }
        }while(continuar!=0);
        scanner.close();
    }
}
