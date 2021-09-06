package banco;

public class Conta {
    
    private static int prox_num = 0;
    
    private Cliente titular;
    private String numero;
    private double saldo;

    public Conta(Cliente titular) {
        this.titular = titular;
        this.numero = String.valueOf(++prox_num);
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    
    public void sacar(double valor) {
        saldo = saldo - valor;
    }
    
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public String toString() {
        return titular.getNome() + " -> "  + saldo;
    }
}
