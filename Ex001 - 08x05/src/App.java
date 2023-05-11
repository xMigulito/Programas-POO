import fornecedor.Fornecedor;
import funcionario.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Funcionario fun = new Funcionario(01,"Repositor","Paulo","Rua Bardo","4599887-8908","paulinmatador@gmail.com");
        System.out.println(fun);
        Fornecedor fornecedor = new Fornecedor("Pau Pra Toda Obra", "123456000122", "Geremias", "Rua Bruxas", "4530547856", "paupratodaobra@outlook.com");
        System.out.println(fornecedor);
    }
}
