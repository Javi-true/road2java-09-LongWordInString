//importing Scanner class.
import java.util.Scanner;
public class LongerWord {
    //main method.
    public static void main(String[] args){

    //instancing scanner object.
    Scanner scan = new Scanner(System.in);

    //Asking user to input a sentence.
    System.out.print("Please write a sentence: ");
    String sentence = scan.nextLine();
    scan.close();

    //splitting string in an array.
    String[] split = sentence.split("\\s+");

    //longer word container.
    String longer = "";

    //comparison.
    for (int i = 0; i < split.length; i++){
        if (split[i].length() > longer.length() ){
            longer = split[i];
        }
    }
    System.out.println(longer);
    }
}
