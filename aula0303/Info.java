package aula0303;

public class Info {
    public static void main(String[] args) {
        Departamento d1 = new Departamento(1, "Ponta Direita");
        Funcionario f1 = new Funcionario(11, "Mohamed Salah", d1);

        System.out.println(f1);
    }
}
