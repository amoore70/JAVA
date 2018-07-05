package classandobjects;

/**
 *
 * @author LukasVyhnalek
 */
public class Dog {
    /* ATTRIBUTES */
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Dog() {
        this.name = "MyDog";
        this.age = 1;
    }

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
    
    public void makeSound(){
        System.out.println( this.name + " says Whof Whof");
    }
}
