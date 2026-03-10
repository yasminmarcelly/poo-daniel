public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj){
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    public String setCnpj(String cnpj){
        return this.cnpj = cnpj;
    }

    public String getNome(){
        return super.getNome();
    }

    public String setNome(String nome){
        return super.setNome(nome);
    }
}
