package heroi;

import arma.*;

public abstract class Heroi {

    private String nome;
    private int forca;
    private double velocidade;
    private double saude;
    private double diferenca; // Variável criada para armazenar a diferença entre o peso da arma e a constante 5 (definida pelo professor).
    private double auxiliar = 0; // Variável criada para consevar a velocidade original
    
    // Heroi pode ter uma arma
    private Arma arma = null;
    
    public Heroi(String nome, int forca, double velocidade) {
        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;
        this.auxiliar = velocidade;
        this.saude = 100;
    }
    
    public void hit(int dano){
        setSaude(getSaude()-dano);
    }
    
    // Método para o Herói largar a arma!
    
    public void drop(){
        System.out.println(nome+" largou a arma "+arma.getDescricao());
        this.arma = null;
        setVelocidade(auxiliar);
    }
    
    public abstract void power();
    
    public void attack() {
        if (arma == null) {
            System.out.println(nome + " Ataca: SOCO com força " + forca);
        } else {
            arma.action();
        }
    }
    
    public void run() {
        System.out.println(nome + " está correndo na velocidade " + velocidade);
    }
    
    public void jump() {
        System.out.println(nome + " está pulando");
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getForca() {
        return forca;
    }
    
    public double getVelocidade() {
        return velocidade;
    }
    
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    
    public void setSaude(double saude){
        this.saude = saude;
        if(this.saude<=0){
            System.out.println("");
            System.out.println("--GAME OVER--");
            System.out.println(nome+" está morto! ");
        }
    }
    
    public double getSaude() {
        return saude;
    }
    
    public Arma getArma() {
        return arma;
    }
    
    public void setArma(Arma arma) {
        if (forca >= arma.getPeso()) {
            this.arma = arma;
        } else {
            System.out.println(nome + " não pode carregar a arma " + arma.getDescricao());
        }
        
       if(arma.getPeso() > 5 && getArma()!=null){
            auxiliar = getVelocidade(); // Armazena a velocidade original
            diferenca = arma.getPeso() - 5; 
            diferenca = (diferenca*10)/100; // transformação em porcentagem
            System.out.println(nome+" está perdendo "+diferenca*100+" por cento de sua velocidade por causa do peso da arma "+arma.getDescricao());
            setVelocidade(getVelocidade() - getVelocidade()*diferenca);
            
        }
        
    }
}
