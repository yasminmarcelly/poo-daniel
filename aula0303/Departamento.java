package aula0303;

public class Departamento {
    private int codigo;
    private String nome;

    public Departamento(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public int setCodigo(int codigo){
        return this.codigo = codigo;
    }

     public String getNome(){
        return this.nome;
    }

    public String setNome(String nome){
        return this.nome = nome;
    }

    public String toString(){
        return "\nDepartamento: " + nome + "\nCódigo: " + codigo;  
    }
}
