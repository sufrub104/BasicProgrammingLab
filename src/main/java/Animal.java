public abstract class Animal {
    protected String name;
    protected int age;
    protected int health;
    protected int hunger;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
        this.hunger = 0;
    }

    public abstract void makeSound();
    public abstract String getType();

    public void feed() {
        System.out.println(name + " is eating.");
        this.hunger = 0;
        this.health = 100;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return this.hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void tick() {
        this.hunger = this.hunger + 5;
        if(this.hunger >= 30){
            this.health = this.health - 5;
        }
        if(this.hunger > 100) {
            this.hunger = 100;
        }
        if(this.health < 0){
            this.health = 0;
        }
    }

}
