package com.example;

public final class Videogame extends Produto{

    private final String processador;
    private final int memoria;

    public Videogame(String nome, double valor, String processador, int memoria){
        super(nome, valor);
        this.processador=processador;
        this.memoria=memoria;
    }

    @Override
    public void ligar() {
        System.out.println("Conecta na tv e emite sinal");
        
    }

    public String getProcessador(){
        return this.processador;
    }

    public int getMemoria() {
        return memoria;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((processador == null) ? 0 : processador.hashCode());
        result = prime * result + memoria;
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
        Videogame other = (Videogame) obj;
        if (processador == null) {
            if (other.processador != null)
                return false;
        } else if (!processador.equals(other.processador))
            return false;
        if (memoria != other.memoria)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Videogame [processador=" + processador + ", memoria=" + memoria + ", Nome()=" + getNome()
                + ", Valor()=" + getValor() + "]";
    }

    
    
}
