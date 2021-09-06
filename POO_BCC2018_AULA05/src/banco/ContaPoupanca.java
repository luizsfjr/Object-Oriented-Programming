package banco;


public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void renderJuros(double taxa) {
        this.depositar(this.getSaldo() * taxa);
    }    
}
