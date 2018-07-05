package animalfarm;

/**
 *
 * @author LukasVyhnalek
 */
public class Lion extends Animal {

    boolean haveEatenToday;

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
        this.haveEatenToday = false;
    }

    public void justAte() {
        this.haveEatenToday = true;
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " says Rooar");
    }

    @Override
    public String toString() {
        if (haveEatenToday) {
            return "Hi my name is " + this.name + " and I am Lion.";
        } else {
            return "Hi my name is " + this.name + " and I am hungry Lion.";
        }
    }
}
