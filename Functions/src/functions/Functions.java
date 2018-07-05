package functions;

/**
 *
 * @author Lukas Vyhnalek
 */
public class Functions {

    /* HERE are our function */
    public static int squared(int x) {
        int y = x * x;
        return y;
    }
    
    public static void printThis(int number){
        System.out.println("Number : " + number);
    }
    
    public static boolean isBigger(int first, int second){
        boolean result = first > second;
        return result;
    }
    
    public static void printEndOfProgram(){
        System.out.println("End Of Program");
    }

    /* This is function computer starts executing */
    public static void main(String[] args) {
          int temp = squared(10);
          temp = squared(-5);
          printThis(temp);
          printThis(10 + 15);
          
          boolean result = isBigger(1,5);
          
          if(isBigger(10,8)){
              System.out.println("10 is bigger than 8");
          }
          
          temp = 2;
          while(temp < 1000){
              temp = squared(temp);
          }
          printThis(temp);
          printEndOfProgram();
    }

}
