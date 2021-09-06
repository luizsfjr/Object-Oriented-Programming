package poo_bcc2018_aula02;

import java.util.Scanner;

public class ProblemaExemplo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        
        // Entradas do triangulo X
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        Triangulo x = new Triangulo(a, b, c);  
        
        // Entradas do triangulo Y
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        Triangulo y = new Triangulo(a, b, c);
        
        // Area do triangulo X
        System.out.printf("AREA DO TRIANGULO X: %.4f\n", x.area());

        // Area do triangulo Y
        System.out.printf("AREA DO TRIANGULO Y: %.4f\n", y.area());
        
        if (x.area() > y.area()) {
            System.out.println("TRIANGULO DE MAIOR AREA: X");
        } else if (y.area() > x.area()){
            System.out.println("TRIANGULO DE MAIOR AREA: Y");
        } else {
            System.out.println("AREAS IGUAIS");
        }
    }
    
}
