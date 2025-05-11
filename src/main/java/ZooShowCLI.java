import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.util.Arrays;




public class ZooShowCLI {
    public static final int LION = 1;
    public static final int ELEPHANT = 2;
    public static final int PENGUIN = 3;
    public static final int SNAKE = 4;

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Scanner input = new Scanner(System.in);
        int choice, age, animalType;
        String name;
        do {
            printMenu();
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    chooseAnimalType();
                    animalType = input.nextInt();
                    while (animalType < LION || animalType > SNAKE){
                        System.out.println("Invalid animal choice. Pick a valid number!");
                        chooseAnimalType();
                        animalType = input.nextInt();
                    }
                    input.nextLine();
                    chooseAnimalName();
                    name = input.nextLine();
                    chooseAnimalAge();
                    age = input.nextInt();
                    switch (animalType) {
                        case LION:
                            zoo.zooTick();
                            zoo.addAnimal(new Lion(name,age));
                            System.out.printf("A lion named %s at age %d was added successfully!\n", name, age);
                            break;
                        case ELEPHANT:
                            zoo.zooTick();
                            zoo.addAnimal(new Elephant(name,age));
                            System.out.printf("An elephant named %s at age %d was added successfully!\n", name, age);
                            break;
                        case PENGUIN:
                            zoo.zooTick();
                            zoo.addAnimal(new Penguin(name,age));
                            System.out.printf("A penguin named %s at age %d was added successfully!\n", name, age);
                            break;
                        case SNAKE:
                            zoo.zooTick();
                            zoo.addAnimal(new Snake(name,age));
                            System.out.printf("A snake named %s at age %d was added successfully!\n", name, age);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("The animals in the zoo are:");
                    zoo.printZoo();
                    break;

                case 3:
                    System.out.println("Feeding the animals in the zoo:");
                    zoo.feedingTime();
                    break;
                case 4:
                    System.out.println("Running show");
                    zoo.trickShow();
                    break;
                case 5:
                    try {
                        ObjectMapper mapper = new ObjectMapper();
                        mapper.writerWithDefaultPrettyPrinter().writeValue(new File("zoo.json"), zoo);
                        return;
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                default:
                    System.out.println("Invalid choice");
                    return;
            }

        } while(true);
    }

    public static void chooseAnimalType(){
        System.out.println("Select an animal to add:");
        System.out.println("1. Lion");
        System.out.println("2. Elephant");
        System.out.println("3. Penguin");
        System.out.println("4. Snake");
    }

    public static void chooseAnimalName(){
        System.out.println("Choose a valid animal name:");
    }

    public static void chooseAnimalAge(){
        System.out.println("Choose a valid animal age:");
    }

    public static void printMenu(){
        System.out.println("Choose an option for the zoo:");
        System.out.println("1. Add Animal");
        System.out.println("2. List Animals");
        System.out.println("3. Feed Animals");
        System.out.println("4. Run Show");
        System.out.println("5. Exit");
    }
}
