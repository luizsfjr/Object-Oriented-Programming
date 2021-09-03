package heroi;

public class Gorila extends Heroi {
    
    public Gorila() {
        super("Brutus", 10, 3);
    }

   //@Override

    @Override
    public void power() {
        System.out.println("FOGO");
        setSaude(getSaude() - getSaude()*0.15);
    }
   
}
