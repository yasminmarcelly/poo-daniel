import java.util.*;

public class Dog extends Animal{
    public Dog(long id, int idade, double peso){
        super(id, "Buddy", idade, peso, new ArrayList<>(List.of("sniff")));
    }

    public String sound(){
        return "au";
    }
}
