package arma;

public class Machado extends Arma {

    public Machado() {
        super("Machado", 6, 7);
    }

    @Override
    public void action() {
        System.out.println("MACHADADA");
    }
       
}
