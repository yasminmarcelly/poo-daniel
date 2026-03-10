public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, int idade, String cpf){
        super(nome, idade);
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public String setCpf(String cpf){
        return this.cpf = cpf;
    }

    public String getNome(){
        return super.getNome();
    }

    public String setNome(String nome){
        return super.setNome(nome);
    }

    public int getIdade(){
        return super.getIdade();
    }

    public int setIdade(int idade){
        return super.setIdade(idade);
    }
}
