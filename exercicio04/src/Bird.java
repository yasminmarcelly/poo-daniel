import java.util.*;

public class Bird extends Animal{
    public Bird(long id, int idade, double peso){
        super(id, "Tweety", idade, peso, new ArrayList<>(List.of("fly")));
    }

    public String sound(){
        return "piu";
    }
}
