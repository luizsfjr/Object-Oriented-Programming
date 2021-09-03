package arma;

public class Faca extends Arma {

    public Faca() {
        super("Faca", 1, 3);
    }
    
    @Override
    public void action() {
        System.out.println("ESTOCADA");
    }

    
    
}
