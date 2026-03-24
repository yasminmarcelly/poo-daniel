public class LocadoraEstoque {
    public static void main(String[] args) {
        Filme f1 = new Filme("Dune Part 1","Sci-fi",2021);
        Filme f2 = new Filme("Batman","Action",2022);
        Filme f3 = new Filme("Sorry, Baby","Drama");

        Locadora locadora = new Locadora("Locadora");
        locadora.adicionarFilme(f1);
        locadora.adicionarFilme(f2);
        locadora.adicionarFilme(f3);
        locadora.listarFilmes();
    }

}
