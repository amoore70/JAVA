package animalfarm;

/**
 *
 * @author LukasVyhnalek
 */
public class Pig extends Animal{
    int weight;

    public Pig(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " says Quie Quie");
    }

    @Override
    public String toString() {
        return "Hi my name is " + this.name
                + " my weight is " + this.weight + "kg and I am Pig.";
    }
}
