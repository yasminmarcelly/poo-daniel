public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Gerente("Salah", 6200,"Tecnologia");
        funcionarios[1] = new Funcionario("Klopp", 3000);
        funcionarios[2] = new Desenvolvedor("Firmino", 5000,"Java");

        imprimir(funcionarios);
    }

    public static void imprimir(Funcionario[] f){
        for (int i = 0; i < f.length; i++){
            System.out.println("Nome: " + f[i].getNome());
            System.out.println("Salário: " + f[i].getSalario());
            if(f[i] instanceof Gerente){
                System.out.println("Bonus de salário: " + ((Gerente)f[i]).calcularBonusGerente());
            } else if(f[i] instanceof Desenvolvedor){
                System.out.println("Bonus de salário: " + ((Desenvolvedor)f[i]).calcularBonusDesenvolvedor());
            } else {
                System.out.println("Bonus de salário: " + f[i].calcularBonus());
            }
            System.out.println("ID unico: " + f[i].getId());
        }
    }
}
