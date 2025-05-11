public class Elephant extends Animal implements Trainable{

    public Elephant(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.printf("Elephant %s is making sound\n", this.name);
    }

    @Override
    public String getType(){
        return "Elephant";
    }

    public void performTrick(){
        System.out.printf("Elephant %s is performing trick\n", this.name);
    }
}
