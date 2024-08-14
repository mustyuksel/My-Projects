package Zoo;

public class Monkey extends Animal implements Feedable {
    private String name;
    public Monkey(String name){
        super(name);

    }
    @Override
    public void makeSound() {
        System.out.println("Scream");
    }
    @Override
    public void Eat(Food food){
        System.out.println(name + "is eating "+ food.getName());
    }
}
