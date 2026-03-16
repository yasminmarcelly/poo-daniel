import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, info;
        int idade;

        nome = sc.next();
        idade = sc.nextInt();
        info = sc.next();
        Pessoa pf = new PessoaFisica(nome, idade, info);
        imprime(pf);
        nome = sc.next();
        idade = sc.nextInt();
        info = sc.next();
        Pessoa pj = new PessoaJuridica(nome, idade, info);
        imprime(pj);
    }

    public static void imprime(Pessoa p){
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        if(p instanceof PessoaFisica){
            System.out.println("CPF: " + ((PessoaFisica)p).getCpf() );
        }
        else {
            System.out.println("CNPJ: " + ((PessoaJuridica)p).getCnpj() );
        }
    }
}
