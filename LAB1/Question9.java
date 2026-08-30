import java.util.Locale;
import java.util.Scanner;
public class Question9 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String sentence = console.nextLine();
        System.out.print("length: " + sentence.length() + " UPPERCASE: " + sentence.toUpperCase() + " lowercase: " + sentence.toLowerCase());
    }
}
