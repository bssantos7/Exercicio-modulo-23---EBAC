package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Cliente {
    private String nome;
    private HashMap<String, Item> carrinho = new HashMap<>();

    public Cliente(String nome){
        this.nome=nome;
        
    }

    public void adicionarItem(Produto produto, int quantidade){
        Item item =new Item(produto, quantidade);
       Random random = new Random();
       int numero = random.nextInt(100);
       String key=item.getProduto().getNome()+numero;
       this.carrinho.put(key, item);
    }

    public void removerItem(String key){
       if(this.carrinho.remove(key)==null){
        System.out.println("O carrinho não possui a chava informada");
       }else{
        System.out.println("Item removido com sucesso");
       }
    }

    public void removerItem(Item item){
        if(this.carrinho.containsValue(item)){
            System.out.println("Foram identificados vários itens no carrinho. Selecione um código abaixo para excluir");
            for(Map.Entry<String,Item> dado:carrinho.entrySet()){
                System.out.println(dado.getKey()+dado.getValue().toString());
            }
        }else{
            System.out.println("O carrinho não contém o item selecionado");
        }
    }

    
    
    public void calculaTotal(){
        double total=0;
        for(Map.Entry<String,Item> dado:carrinho.entrySet()){
            System.out.println(dado.getValue().toString());
            total+=dado.getValue().getProduto().getValor()*dado.getValue().getQuantidade();
        }
        System.out.println("O valor total dos produtos é: "+total);
    }

}
