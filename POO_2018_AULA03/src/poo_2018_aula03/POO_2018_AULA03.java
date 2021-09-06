package poo_2018_aula03;

public class POO_2018_AULA03 {

    public static void main(String[] args) {
        Conta c1 = new Conta("João Batista", "1234-5");
        Conta c2 = new Conta("Paula Leite", "6789-0");
        
        c1.depositar(50);
        c2.depositar(30);
        c1.depositar(100);
        c2.sacar(10);
        c1.sacar(80);
        
        System.out.println("Conta #1");
        System.out.println("Número.: " + c1.getNumero());
        System.out.println("Titular: " + c1.getTitular());
        System.out.println("Saldo..: " + c1.getSaldo());
        
        System.out.println();
        
        System.out.println("Conta #2");
        System.out.println("Número.: " + c2.getNumero());
        System.out.println("Titular: " + c2.getTitular());
        System.out.println("Saldo..: " + c2.getSaldo());
    }
    
}




