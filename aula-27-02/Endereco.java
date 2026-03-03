public class Endereco {
    String logradouro;
    String num;
    String bairro;
    String cidade;
    String estado;

    Endereco(String logradouro, String num, String bairro, String cidade, String estado){
        this.logradouro = logradouro;
        this.num = num;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String toString(){
        return logradouro + ", " + num + " - " + bairro + " - " + cidade + "/" + estado;
    }
}
