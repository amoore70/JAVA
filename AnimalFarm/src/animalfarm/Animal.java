package animalfarm;

/**
 *
 * @author LukasVyhnalek
 */
public class Animal {

    /* ATTRIBUTES */
    String name;
    int age;

    /*GETTERS and SETTERS */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("This method should be overridden in Dog, Pig or Lion class");
    }
}
