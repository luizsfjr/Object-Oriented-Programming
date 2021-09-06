package arma;

public abstract class Arma {
    
    private String descricao;
    private int peso;
    private int dano;
    
    public Arma(String descricao, int peso, int dano) {
        this.descricao = descricao;
        this.peso = peso;
        this.dano = dano;
    }
    
    public abstract void action();

    public String getDescricao() {
        return descricao;
    }

    public int getPeso() {
        return peso;
    }

    public int getDano() {
        return dano;
    }
    
    
}
