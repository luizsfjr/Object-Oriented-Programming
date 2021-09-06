package atividade01_bcc2018;
public class Candidato {
        private int numero;
        private int votos;
        private String nome;
        public Candidato(int numero, String nome ){
            this.numero = numero;
            this.nome = nome;
            votos = 0;
        }
        public int getNumero(){ 
            return this.numero;
        }
        public void setNumero(int num){
            this.numero = num;
        }
        public String getNome(){
            return this.nome;
        }
        public void setNome(String n){
            n = nome;
        }
        public int getVotos(){
            return this.votos;
        }
        public void setVotos(int v){;;
            v = votos;
        }
        public int votar(){
            this.votos = votos + 1;         
            return this.votos;      
        }
}
