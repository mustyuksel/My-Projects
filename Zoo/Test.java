package Zoo;

public class Test {
    public static void main(String[] args){
    Zookeeper zookeeper = new Zookeeper("Josh");

    Lion lion = new Lion("Alex");
    Monkey monkey = new Monkey("Kong");
    Elephant elephant = new Elephant("Rafa");

    Food Meat = new Food("Meat");

    zookeeper.feedAnimals(lion,Meat);
    zookeeper.perform(lion);
    zookeeper.perform(monkey);

    newAnimal.addNewAnimal(new Elephant("Silva"));
    }
}
