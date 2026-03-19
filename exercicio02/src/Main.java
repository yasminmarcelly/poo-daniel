import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ContaBancaria conta = null;
        int opcao;
        do{
            System.out.println("1 - Criar uma conta bancaria");
            System.out.println("2 - Depositar dinheiro");
            System.out.println("3 - Sacar dinheiro");
            System.out.println("4 - Exibir saldo");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome da conta: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o numero da conta: ");
                    String numeroDaConta = sc.nextLine();
                    System.out.println("Digite o saldo da conta: ");
                    int saldo = sc.nextInt();
                    sc.nextLine();
                    conta = new ContaBancaria(nome,numeroDaConta,saldo);
                    break;
                case 2:
                    if(conta == null){
                        System.out.println("É necessario criar uma conta primeiro.");
                        break;
                    }
                        System.out.println("Digite o valor a ser depositado: ");
                        double valor = sc.nextDouble();
                        sc.nextLine();
                        conta.depositar(valor);
                        break;
                case 3:
                    if(conta == null){
                        System.out.println("É necessario criar uma conta primeiro.");
                        break;
                    }
                    System.out.println("Digite o valor a ser retirado: ");
                    double valorSaque = sc.nextDouble();
                    sc.nextLine();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    if(conta == null){
                        System.out.println("É necessario criar uma conta primeiro.");
                        break;
                    }
                    conta.exibirSaldo();
                    break;
                case 0:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }

        }while(opcao != 0);


    }
}
