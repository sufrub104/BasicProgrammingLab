public class Bird extends Animal{
    public boolean hasFur = false;
    public boolean canFly = true;

    public Bird(String name, int age, boolean hasFur, boolean canFly){
        super(name, age);
        this.hasFur = hasFur;
        this.canFly = canFly;
    }

    public void bodyTemperatureRegulation(){
        System.out.println(name + "maintains constant body temperature.");
    }

    @Override
    public void makeSound(){
        System.out.printf("Bird %s is making sound\n", this.name);
    }

    public String getType(){
        return "Bird";
    }


}
