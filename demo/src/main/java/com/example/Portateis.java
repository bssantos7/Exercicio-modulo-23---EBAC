package com.example;

public abstract class Portateis extends Produto{
    private int memoria;
    private final String tela;
    private final boolean dobravel;
    
    public Portateis(String nome, double valor, int memoria, String tela, boolean dobravel) {
        super(nome, valor);
        this.memoria = memoria;
        this.tela = tela;
        this.dobravel = dobravel;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getTela() {
        return tela;
    }

    public boolean isDobravel() {
        return dobravel;
    }    

    public abstract void conectaInternet();

    @Override
    public String toString() {
        return "Portateis [memoria=" + memoria + ", tela=" + tela + ", dobravel=" + dobravel + ", Nome="
                + getNome() + ", Valor=" + getValor() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + memoria;
        result = prime * result + ((tela == null) ? 0 : tela.hashCode());
        result = prime * result + (dobravel ? 1231 : 1237);
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
        Portateis other = (Portateis) obj;
        if (memoria != other.memoria)
            return false;
        if (tela == null) {
            if (other.tela != null)
                return false;
        } else if (!tela.equals(other.tela))
            return false;
        if (dobravel != other.dobravel)
            return false;
        return true;
    }

    

    

    
}
