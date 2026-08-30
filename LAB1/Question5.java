import java.util.Scanner ;
public class Question5 {
    public static void main (String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scn.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scn.nextInt();

        int difference = firstNumber - secondNumber ;
        int sum = firstNumber + secondNumber ;
        int quotient = firstNumber/secondNumber;
        int remainder = firstNumber % secondNumber ;
        int product = firstNumber * secondNumber;

        System.out.println("sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("product: " + product);
        System.out.println("quotient: " + quotient);
        System.out.println("remainer: " + remainder);


    }
}
