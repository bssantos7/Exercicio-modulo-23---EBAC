package com.example;

public final class Celular extends Portateis {

    public Celular(String nome, double valor, int memoria, String tela, boolean dobravel) {
        super(nome, valor, memoria, tela, dobravel);
    }

    @Override
    public void conectaInternet() {
        System.out.println("Conecta a internet via 5G");
        
    }

    @Override
    public void ligar() {
        System.out.println("Liga a tela e faz som!");
        
    }


    

}
