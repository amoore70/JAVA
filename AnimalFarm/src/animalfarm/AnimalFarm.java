package animalfarm;

/**
 *
 * @author LukasVyhnalek
 */
public class AnimalFarm {

    public static void main(String[] args) {
       Animal[] myZoo = new Animal[5];
       Lion greg = new Lion("Greg", 2);
       greg.justAte();
       myZoo[0] = greg;
       myZoo[1] = new Pig("Queen", 4, 200);
       myZoo[2] = new Dog("Ben", 6);
       myZoo[3] = new Lion("Nikol", 20);
       myZoo[4] = new Pig("Mike", 4, 150);
       Farm myLittleFarm = new Farm(myZoo);
       System.out.println(myLittleFarm.toString());
       myLittleFarm.print();
       myLittleFarm.makeSound();
    }
    
}
