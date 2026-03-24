import java.util.*;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        int opcao;
        do {
            System.out.println("1. Adicionar animal");
            System.out.println("2. Listar todos os animais");
            System.out.println("3. Remover animal (por ID)");
            System.out.println("4. Emitir som de um animal (por ID");
            System.out.println("5. Testar habilidade de um animal (por ID)");
            System.out.println("6. Sair do programa");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Qual o tipo (cat/dog/bird) do animal?");
                    String tipo = sc.next();
                    if (!tipo.equalsIgnoreCase("cat") &&
                            !tipo.equalsIgnoreCase("dog") &&
                            !tipo.equalsIgnoreCase("bird")) {
                        System.out.println("Tipo inválido! Use: cat, dog ou bird.");
                        break; // volta ao menu sem perguntar mais nada
                    }
                    System.out.println("Qual o ID do animal?");
                    long id = sc.nextLong();
                    System.out.println("Qual a idade do animal?");
                    int idade = sc.nextInt();
                    System.out.println("Qual o peso do animal?");
                    double peso = sc.nextDouble();
                    if (tipo.equalsIgnoreCase("cat")){
                        zoo.addAnimal(new Cat(id,idade,peso));
                    } else if (tipo.equalsIgnoreCase("dog")) {
                        zoo.addAnimal(new Dog(id,idade,peso));
                    } else if(tipo.equalsIgnoreCase("bird")) {
                        zoo.addAnimal(new Bird(id,idade,peso));
                    }
                    break;
                case 2:
                    ArrayList<Animal> var = zoo.listAnimals();
                    for(Animal animais : var){
                        System.out.println(animais.toString());
                    }
                    break;
                case 3:
                    System.out.println("Digite o ID do animal que deseja remover: ");
                    long num = sc.nextLong();
                    boolean result = zoo.removeAnimal(num);
                    if(result){
                        System.out.println("Animal removido com sucesso.");
                    }else{
                        System.out.println("Animal nao existe no sistema.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o ID do animal: ");
                    long idVar = sc.nextLong();
                    for(Animal animais : zoo.listAnimals()){
                        if(animais.getId() == idVar){
                            System.out.println(animais.getName() + " says " + animais.sound());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Digite o ID do animal: ");
                    long idVar2 = sc.nextLong();
                    for(Animal animais : zoo.listAnimals()){
                        if(animais.getId() == idVar2){
                            System.out.println("Qual habilidade voce quer testar? (sniff/agility/fly");
                            String hab = sc.next();
                            System.out.println(animais.performAbility(hab));
                        }
                    }
                    break;
                case 6:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }while(opcao!=6);
    }
}
