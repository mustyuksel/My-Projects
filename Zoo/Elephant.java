package Zoo;

public class Elephant extends Animal implements Feedable{
    private String name;

    public Elephant(String name){
        super(name);

    }
    @Override
    public void makeSound() {
        System.out.println("Trumpet");
    }
    @Override
    public void Eat(Food food){
        System.out.println(name + "is eating "+ food.getName());
    }

}
