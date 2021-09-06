package banco;

public class ContaEspecial extends Conta {
    
    private double bonus;
    
    public ContaEspecial(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void depositar(double valor) {
        this.bonus = this.bonus + (valor * 0.01);
        super.depositar(valor); 
    }
    
    public void renderBonus() {
        this.depositar(bonus);
        bonus = 0;
    }
    
}
