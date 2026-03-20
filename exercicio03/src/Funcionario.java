import java.util.UUID;

public class Funcionario {
    private String nome;
    private double salario;
    private static int totalFuncionarios;
    private final String id;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        this.id = UUID.randomUUID().toString();
        totalFuncionarios++;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public String getId(){
        return this.id;
    }

    public double calcularBonus(){
        return salario * 0.1;
    }
}
