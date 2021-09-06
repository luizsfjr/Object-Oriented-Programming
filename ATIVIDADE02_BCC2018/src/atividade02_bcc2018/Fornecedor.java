
package atividade02_bcc2018;

public class Fornecedor {
    private String cnpj;
    private String fornecedor;
    private String telefone;
    private Produto produto;
    public Fornecedor(String cnpj, String fornecedor, String telefone, Produto produto){
        this.cnpj = cnpj;
        this.fornecedor = fornecedor;
        this.telefone = telefone;
        this.produto = produto;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
    public String getFornecedor(){
        return this.fornecedor;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return this.telefone;
    }
}
