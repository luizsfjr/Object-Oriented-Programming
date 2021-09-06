package arma;

public class Revolver extends Arma {

    public Revolver() {
        super("Revolver", 3, 10);
    }

    @Override
    public void action() {
        System.out.println("TIRO");
    }

}
