public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.printf("Lion %s is making sound\n", this.name);
    }

    @Override
    public String getType(){
        return "Lion";
    }

}
