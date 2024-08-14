package Zoo;

public class Lion extends Animal implements Feedable,Performable {
    private String name;
    public Lion (String name){
        super(name);

    }
    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void Eat(Food food){
        System.out.println(name + "is eating "+ food.getName());
    }
    @Override
    public void performable(){
        System.out.println(name + "dances");
    }
}
