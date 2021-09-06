package atividade01_bcc2018;
/*
Atividade desenvolvida por Luiz Carlos da Silva Fernandes Junior
como método avaliativo para a disciplina de POO 2018.
*/
public class ATIVIDADE01_BCC2018 {
    public static void main(String[] args) {
        int numero;
        int votos = 0;
        String nome;
        numero = 20;
        nome = "Luiz Carlos";
        Candidato c1 = new Candidato(numero,nome);
        Candidato c2 = new Candidato(12,"Maria");    
        Candidato c3 = new Candidato(20,"José");
        c1.votar();
        c1.votar();
        c1.votar();
        c2.votar();
        c2.votar();
        c3.votar(); 
        System.out.println("Candidato: "+c1.getNome());
        System.out.println("quantidade de votos: "+c1.getVotos());
        System.out.println("Candidata: "+c2.getNome());
        System.out.println("quantidade de votos: "+c2.getVotos());
        System.out.println("Candidato: "+c3.getNome());
        System.out.println("quantidade de votos: "+c3.getVotos());
    }
}
