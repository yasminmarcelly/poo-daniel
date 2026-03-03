public class Cadastro {
    public static void main(String[] args) {
        Data d1 = new Data(15,06,1992);
        Telefone t1 = new Telefone("081", "40028922");
        Endereco end1 = new Endereco("rua do principe", "526", "boa vista", "recife", "pernambuco");
        Cliente cl1 = new Cliente("mohamed salah", "11111111", "1010101010", t1, d1, end1);

        System.out.println("Dados do Cliente");
        System.out.println(cl1.toString());
    }
}

