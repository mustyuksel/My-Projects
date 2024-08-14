package Zoo;

public class Zookeeper {
    private String name;
    public Zookeeper(String name){
        this.name=name;
    }
    public void feedAnimals(Animal animal,Food food){
        System.out.println(name + " is feeding " + animal.getName() +  " a " +food.getName());
    }
    public void perform(Animal animal){
        if(animal instanceof Performable){
            System.out.println(name + " is making "+ animal.getName() + " perform ");
        }
        else{
            System.out.println(animal.getName() + " cant perform");
        }
    }

}
