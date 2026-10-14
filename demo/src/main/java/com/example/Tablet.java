package com.example;

public final class Tablet extends Portateis{

    public Tablet(String nome, double valor, int memoria, String tela, boolean dobravel) {
        super(nome, valor, memoria, tela, dobravel);
    }

    @Override
    public void conectaInternet() {
        System.out.println("Conecta internet via wi-fi");
        
    }

    @Override
    public void ligar() {
        System.out.println("Liga a tela e faz som");
        
    }

}
