import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals;

    public Zoo(){
        animals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {
        if(animal == null){
            System.out.println("Given animal to add is null!");
            return;
        }
        animals.add(animal);
    }

    public void printZoo() {
        int i=1;
        for(Animal animal : animals){
            System.out.printf("Animal number %d in the zoo is : %s\n", i, animal.getType());
            i++;
        }
        if(i == 1){
            System.out.println("The zoo is empty!");
        }
    }

    public void feedingTime() {
        if(animals.isEmpty()){
            System.out.println("The zoo is empty!");
            return;
        }
        for(Animal animal : animals){
            animal.feed();
        }
    }

    public void trickShow() {
        if(animals.isEmpty()){
            System.out.println("The zoo is empty!");
            return;
        }
        int i = 0;
        for(Animal animal : animals) {
            if(animal instanceof Elephant ||  animal instanceof Penguin){
                ((Trainable) animal).performTrick();
                i++;
            }
        }
        if(i == 0){
            System.out.println("No animal in the zoo can perform trick right now!");
        }
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void zooTick() {
        if(animals.isEmpty()){
            return;
        }
        for(Animal animal : animals){
            animal.tick();
        }
    }


}
