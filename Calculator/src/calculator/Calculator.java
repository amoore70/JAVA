
package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {
        // this line is here for us to be able to comunicate with user via console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // if you want data from user just write reader.readLine();
        System.out.print("Write number : ");

        String userInput = reader.readLine();
        System.out.println("You wrote : " + userInput);

        int value = Integer.parseInt(userInput);
        System.out.println("Integer value : " + value);
        
    }
    
}
