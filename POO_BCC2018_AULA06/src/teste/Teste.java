package teste;

import heroi.*;
import arma.*;
import java.util.Random;

public class Teste {

    public static void main(String[] args) {
        
        Arma[] arma = new Arma[4];
        
        arma[0] = new Faca();
        arma[1] = new Machado();
        arma[2] = new Revolver();
        arma[3] = new Marreta();
        
        Heroi heroi1 = new Macaco();
        
        heroi1.run(); 
        heroi1.jump();
        heroi1.attack();
        
        Random random = new Random(System.currentTimeMillis());
        int i = random.nextInt(4);
        
        System.out.println(heroi1.getNome() + " encontrou uma arma.");
        heroi1.setArma(arma[i]);
        heroi1.attack();
        heroi1.power();
        System.out.println("Vida após utilização do poder especial: "+heroi1.getSaude());
        heroi1.run();
        if(heroi1.getArma()!= null){
            heroi1.drop();
            heroi1.run();
        }
        heroi1.hit(50);
        System.out.println("Vida após levar um hit de 50: "+heroi1.getSaude());
        System.out.println("");
        System.out.println("------------");
        System.out.println("");
        Heroi heroi2 = new Mico();
        
        heroi2.run(); 
        heroi2.jump();
        heroi2.attack();
        
        System.out.println(heroi2.getNome() + " encontrou uma arma.");
        heroi2.setArma(arma[i]);
        heroi2.attack();
        heroi2.power();
        heroi2.power();
        System.out.println("Vida após utilização do poder especial: "+heroi2.getSaude());
        heroi2.run();
        if(heroi2.getArma()!= null){
            heroi2.drop();
            heroi2.run();
        }
        heroi2.hit(70);
        System.out.println("Vida após levar um hit de 70: "+heroi2.getSaude());
        System.out.println("");
        System.out.println("------------");
        System.out.println("");
        
        Heroi heroi3 = new Gorila();
        
        heroi3.run(); 
        heroi3.jump();
        heroi3.attack();
        
        System.out.println(heroi3.getNome() + " encontrou uma arma ");
        heroi3.setArma(arma[i]);
        heroi3.attack();
        heroi3.power();
        heroi3.power();
        heroi3.power();
        System.out.println("Vida após utilização do poder especial: "+heroi3.getSaude());
        heroi3.run();
        if(heroi3.getArma()!= null){
            heroi3.drop();
            heroi3.run();
        }
        heroi3.hit(90);
        System.out.println("");
        System.out.println("Vida após levar um hit de 90: "+heroi3.getSaude());
      
    }
    
}
