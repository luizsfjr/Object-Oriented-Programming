
package arma;

public class Marreta extends Arma{
    public Marreta(){
        super("Marreta", 7,9);
    }

    @Override
    public void action() {
        System.out.println("MARRETADA");
    }
}
    

