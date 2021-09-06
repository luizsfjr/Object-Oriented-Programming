package banco;

public class Teste {

    public static void main(String[] args) {
        
        Cliente cli01 = new Cliente("11111111111", "João Batista", 'M', "99132-8587");
        Cliente cli02 = new Cliente("22222222222", "Paula Leite", 'F', "99234-8242");
        
        Conta c1 = new Conta(cli01);
        Conta c2 = new Conta(cli02);
        Conta c3 = new ContaPoupanca(cli02);
        Conta c4 = new ContaEspecial(cli01);
        
        cli02.setNome("Paula Sousa");
        
        c1.depositar(100);
        c1.sacar(15);
        
        c3.depositar(500);
        c3.sacar(30);
        
        c4.depositar(10000);
        c4.sacar(9000);
        
        if(c2 instanceof ContaPoupanca)
            ((ContaPoupanca)c2).renderJuros(0.01);
        
        if(c4 instanceof ContaEspecial)
            ((ContaEspecial)c4).renderBonus();
        if(c4 instanceof ContaEspecial)
            ((ContaEspecial)c4).renderBonus();
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        
    }
    
}
