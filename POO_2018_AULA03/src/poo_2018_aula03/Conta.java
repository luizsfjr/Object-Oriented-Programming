package poo_2018_aula03;

public class Conta {
    
    private String titular;
    private String numero;
    private double saldo;

    public Conta(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    
    public void sacar(double valor) {
        saldo = saldo - valor;
    }
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    
}

