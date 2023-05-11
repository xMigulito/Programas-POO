package funcionario;

import pessoa.Pessoa;

public class Funcionario extends Pessoa {
    int matricula;
    String cargo;
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Funcionario(int matricula, String cargo, String nome, String endereco, String telefone, String email ) {
        this.matricula = matricula;
        this.cargo = cargo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Funcionario [matricula=" + matricula + ", cargo=" + cargo + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + "]";
    }
    

   

    

}
