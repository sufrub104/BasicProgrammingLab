public class Snake extends Animal{

    public Snake(String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.printf("Snake %s is making sound\n", this.name);
    }

    @Override
    public String getType(){
        return "Snake";
    }
}
