public class Reptile extends Animal{
    public boolean hasFur = false;
    public boolean canFly = false;

    public Reptile(String name, int age, boolean hasFur, boolean canFly){
        super(name, age);
        this.hasFur = hasFur;
        this.canFly = canFly;
    }

    public void bodyTemperatureRegulation() {
        System.out.println(name + "does not maintain constant body temperature.");
    }

    @Override
    public void makeSound() {
        System.out.printf("Reptile %s is making sound\n", this.name);
    }

    public String getType() {
        return "Reptile";
    }


}
