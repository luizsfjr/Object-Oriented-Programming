package banco;

public class Teste {

    public static void main(String[] args) {
        
        Cliente cli01 = new Cliente("11111111111", "João Batista", 'M', "99132-8587");
        Cliente cli02 = new Cliente("22222222222", "Paula Leite", 'F', "99234-8242");
        
        Conta c1 = new Conta(cli01);
        Conta c2 = new Conta(cli02);
        
        cli02.setNome("Paula Sousa");
        
        c1.depositar(100);
        c1.sacar(15);
        
        System.out.println(c1);
        System.out.println(c2);
        
    }
    
}
