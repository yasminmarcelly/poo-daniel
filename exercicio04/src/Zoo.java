import java.util.*;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public ArrayList<Animal> listAnimals(){
        return animals;
    }

    public boolean removeAnimal(long id){
        for(int i = 0; i < animals.size(); i++){
            Animal current = animals.get(i);
            if(current.getId() == id){
                animals.remove(current);
                return true;
            }
        }
        return false;
    }
}
