package animalfarm;

/**
 *
 * @author LukasVyhnalek
 */
public class Farm {
    Animal[] animals;
    
    public Farm(Animal[] animals){
        this.animals = animals;
    }
    
    public void print(){
        for(int i = 0; i < this.animals.length; i++){
            System.out.println(this.animals[i].toString());
        }
    }
    
    public void makeSound(){
        for(int i =0; i < this.animals.length; i++){
            this.animals[i].makeSound();
        }
    }
}
