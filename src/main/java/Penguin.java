public class Penguin extends Animal implements Trainable {

    public Penguin(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.printf("Penguin %s is making sound\n", this.name);
    }

    @Override
    public String getType(){
        return "Penguin";
    }

    public void performTrick(){
        System.out.printf("Penguin %s is performing trick\n", this.name);
    }
}
