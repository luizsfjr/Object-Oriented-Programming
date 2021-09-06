package heroi;

public class Macaco extends Heroi {

    public Macaco() {
        super("Fredy", 6, 6);
    }

   // @Override

    @Override
    public void power() {
        System.out.println("RAIO CONGELANTE");
        setSaude(getSaude() - getSaude()*0.15);
    }

    
    
}
