package array;

/**
 *
 * @author LukasVyhnalek
 */
public class Array {

    public static void main(String[] args) {
        int[] ages = {10,5,12,20,18};
        System.out.println("age on index 0 is : " + ages[0]);
        int onIndex2 = ages[2];
        System.out.println("age on index 2 is : " + onIndex2);
        ages[2] = ages[2] + 1;
        System.out.println("age on index 2 is now :" + ages[2]);
        System.out.println("how many numbers are in ages array :" + ages.length);
        
        String[] names = {"Adam", "Ava", "Paul", "Emily"};
        System.out.println("first name : " + names[0]);
        String secondName = names[1];
        System.out.println("second name" + secondName);
        names[2] = "James";
        System.out.println("third name is now :" + names[2]);
        System.out.println("how many names are in array :" + names.length);
    }
    
}
