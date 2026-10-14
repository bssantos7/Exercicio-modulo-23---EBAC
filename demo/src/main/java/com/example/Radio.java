package com.example;

public final class Radio extends Produto{
    private final String caixaSom;

    public Radio(String nome, double valor, String caixaSom) {
        super(nome, valor);
        this.caixaSom = caixaSom;
    }

    @Override
    public void ligar() {
        System.out.println("Faz som!");
        
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((caixaSom == null) ? 0 : caixaSom.hashCode());
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
        Radio other = (Radio) obj;
        if (caixaSom == null) {
            if (other.caixaSom != null)
                return false;
        } else if (!caixaSom.equals(other.caixaSom))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Radio [caixaSom=" + caixaSom + ", Nome()=" + getNome() + ", Valor()=" + getValor() + "]";
    }

    
}
