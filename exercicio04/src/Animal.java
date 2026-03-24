import java.util.*;

public class Animal {
    private long id;
    private String name;
    private int age;
    private double weight;
    private ArrayList<String> abilities = new ArrayList<>();

    public Animal(long id, String nome, int idade, double peso, ArrayList<String> habilidades ){
        this.id = id;
        this.name = nome;
        this.age = idade;
        this.weight = peso;
        this.abilities = habilidades;
    }

    public String performAbility(String ability){
        if(abilities.contains(ability)){
            return name + " can " + ability;
        }
        return name + " can't " + ability;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String sound() {
        return null;
    }

    public String toString(){
        return "Nome: " + name + " ID: " + id + " Idade: " + age;
    }

}
