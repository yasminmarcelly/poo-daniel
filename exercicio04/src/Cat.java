import java.util.*;


public class Cat extends Animal{
    public Cat(long id, int idade, double peso){
        super(id, "Whiskers", idade, peso, new ArrayList<>(List.of("agility")) );
    }

    public String sound(){
        return "meow";
    }

}
