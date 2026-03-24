import java.util.*;

public class MainArrayList {
    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList<>();
        Funcionario g = new Gerente("Salah", 6200,"Tecnologia");
        Funcionario f = new Funcionario("Klopp", 3000);
        Funcionario d = new Desenvolvedor("Firmino", 5000,"Java");
        lista.add(g);
        lista.add(f);
        lista.add(d);

        imprimir(lista);

    }

    public static void  imprimir(ArrayList<Funcionario> lista){
        for(Funcionario funcionarios : lista){
            System.out.println("Nome: " + funcionarios.getNome());
            System.out.println("Salario: " + funcionarios.getSalario());
            if(funcionarios instanceof Gerente){
                System.out.println("Bonus: " + ((Gerente)funcionarios).calcularBonusGerente());
            } else if (funcionarios instanceof Desenvolvedor){
                System.out.println("Bonus: " + ((Desenvolvedor)funcionarios).calcularBonusDesenvolvedor());
            } else {
                System.out.println("Bonus: " + funcionarios.calcularBonus());
            }
            System.out.println();
        }
    }
}
