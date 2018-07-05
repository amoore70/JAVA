
package guessnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber {

    public static int generateRandomInteger(int from, int to){
        return (int)(Math.random() * to + from);
    }
    public static void main(String[] args) throws IOException {
         // this line is here for us to be able to comunicate with user via console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // if you want data from user just write reader.readLine();
        
        int generatedNumber = generateRandomInteger(0, 100);
        
        System.out.println("How Many Guesses you want ?");
        String userInput = reader.readLine();
        int remainingGuesses = Integer.parseInt(userInput);
    }
    
}
