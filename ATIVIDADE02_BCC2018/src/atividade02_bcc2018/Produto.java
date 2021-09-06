
package atividade02_bcc2018;

public class Produto {
    private String nome;
    private int estoque;
    private double preco;
    public Produto(String nome, int estoque, double preco){
        this.nome = nome;
        this.estoque = 0;
        this.preco = preco;  
    }
    public int entradaEstoque(){
        return estoque++;
    }
    public int saidaEstoque(){
        return estoque--;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public int getEstoque(){
        return this.estoque;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
}
