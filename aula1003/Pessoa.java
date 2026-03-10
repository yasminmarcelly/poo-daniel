public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }   

    public int getIdade(){
        return idade;
    }

    public int setIdade(int idade){
        return this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public String setNome(String nome){
        return this.nome = nome;
    }
}