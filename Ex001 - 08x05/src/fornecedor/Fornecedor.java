package fornecedor;

import pessoa.Pessoa;

public class Fornecedor extends Pessoa {
    String razaoSocial;
    String cnpj;
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Fornecedor(String razaoSocial, String cnpj,String nome, String endereco, String telefone, String email) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Fornecedor [razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + "]";
    }
    
    
}
