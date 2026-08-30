import java.util.Scanner;
public class Question4 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int wholeNumber = console.nextInt();
        System.out.print("Enter a decimal number: ");
        double decimal = console.nextDouble();
        System.out.print("Enter a single word: ");
        String singleWord = console.next();
        System.out.print("you entered the following: " +wholeNumber +","+decimal+","+singleWord);
    }
}
