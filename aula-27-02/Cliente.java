public class Cliente {
    String nome;
    String rg;
    String cpf;
    Telefone telefone;
    Data dataDeNascimento;
    Endereco endereco;

    Cliente(String nome, String rg, String cpf, Telefone telefone, Data dataDeNascimento, Endereco endereco){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;

    }

    public String toString(){
        return "Nome: " + nome + 
        "\nRG: " + rg + 
        "\nCPF: " + cpf +
        "\nTelefone: " + telefone + 
        "\n Data de Nascimento: " + dataDeNascimento + 
        "\n Endereço: " + endereco;
    }
}
