
package atividade02_bcc2018;
/*
Atividade desenvolvida por Luiz Carlos da Silva Fernandes Junior
como método avaliativo para a disciplina de POO 2018.
*/
public class ATIVIDADE02_BCC2018 {

    public static void main(String[] args) {
        Produto P1 = new Produto("caixa", 2, 4.50);
        Produto P2 = new Produto("bombom", 5, 5.00);
        Fornecedor F1 = new Fornecedor("12345","Aciclista","997689253",P1);
        Fornecedor F2 = new Fornecedor("45678","M.Floriano","45678909",P2);
        P1.entradaEstoque();
        P1.entradaEstoque();
        P2.entradaEstoque();
        P1.entradaEstoque();
        P2.entradaEstoque();
        P1.saidaEstoque();
        P2.saidaEstoque();
        System.out.println("Produto: "+P1.getNome());
        System.out.println("Quantidade disponível: "+P1.getEstoque());
        System.out.println("Produto: "+P2.getNome());
        System.out.println("Quantidade disponível: "+P2.getEstoque());
        
        
        
    }
    
}
