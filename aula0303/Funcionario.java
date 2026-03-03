package aula0303;

public class Funcionario {
    private int matricula;
    private String nome;
    private Departamento depto;

    public Funcionario(int matricula, String nome, Departamento depto){
        this.matricula = matricula;
        this.nome = nome;
        this.depto = depto;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

     public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Departamento getDepto(){
        return depto;
    }

    public void setDepto(Departamento depto){
        this.depto = depto;
    }

    public String toString(){
        return "Dados do Funcionario: " + "\nNome: " + nome + "\nMatrícula: " + matricula + getDepto(); 
    }
}
