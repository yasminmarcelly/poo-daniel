public class ContaBancaria{
    private String nome;
    private String numeroDaConta;
    private double saldo;

    public ContaBancaria(String nome, String numeroDaConta, double saldo){
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("O valor depositado nao pode ser menor que 0. Tente novamente.");
             return;
        }
        saldo += valor;
        System.out.println("Valor $" + valor + " depositado com sucesso.");
    }
    public void sacar(double valor){
        if(valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        saldo -= valor;
        System.out.println("Valor $" + valor + " sacado com sucesso.");
    }
    public void exibirSaldo(){
        System.out.println("Nome: " + nome);
        System.out.println("Numero da Conta: " + numeroDaConta);
        System.out.println("Saldo: " + saldo);
    }
}