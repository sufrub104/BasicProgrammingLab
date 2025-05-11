public class Mammal extends Animal{
    public boolean hasFur = true;
    public boolean canFly = false;

    public Mammal(String name, int age, boolean hasFur, boolean canFly){
        super(name, age);
        this.hasFur = hasFur;
        this.canFly = canFly;
    }

    public void bodyTemperatureRegulation(){
        System.out.println(name + "maintains constant body temperature.");
    }

    @Override
    public void makeSound(){
        System.out.printf("Mammal %s is making sound\n", this.name);
    }

    public String getType(){
        return "Mammal";
    }


}
