package animalfarm;

/**
 *
 * @author LukasVyhnalek
 */
public class Dog extends Animal{

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " says Whof Whof");
    }

    @Override
    public String toString() {
        return "Hi my name is " + this.name + " and I am Dog.";
    }
}

