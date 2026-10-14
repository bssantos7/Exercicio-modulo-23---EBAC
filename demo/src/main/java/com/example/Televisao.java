package com.example;

public final class Televisao extends Produto {
    private final String tela;

    public Televisao(String nome, double valor, String tela){
        super(nome, valor);
        this.tela=tela;
    }

    @Override
    public void ligar() {
        System.out.println("Liga a tela e faz som!");
    }

    public String getTela() {
        return tela;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tela == null) ? 0 : tela.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Televisao other = (Televisao) obj;
        if (tela == null) {
            if (other.tela != null)
                return false;
        } else if (!tela.equals(other.tela))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Televisao [tela=" + tela + ", nome=" + getNome() + ", Valor()=" + getValor() + "]";
    }

    

    
}
