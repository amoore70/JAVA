package dowhile;

/**
 *
 * @author LukasVyhnalek
 */
public class DoWhile {

    public static void main(String[] args) {
        
        int i = 10;
        do{
            i++;
        }while(i < 10);
        
        System.out.println(i);
        
        i = 10;
        while(i < 10){
            System.out.println("This will never happen");
            i++;
        }
        System.out.println("End of program");
    }
    
}
