public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, double salario,String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }

    public double calcularBonusGerente(){
        return getSalario() * 0.2;
    }
}
