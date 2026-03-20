public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem){
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public double calcularBonusDesenvolvedor(){
        return getSalario() * 0.15;
    }
}
