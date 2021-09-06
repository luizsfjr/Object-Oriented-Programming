package heroi;

public class Mico extends Heroi {

    public Mico() {
        super("Simão", 3, 10);
    }

    @Override
    public void power() {
        System.out.println("CHOQUE");
        setSaude(getSaude() - getSaude()*0.15);
    }

  
    
}
