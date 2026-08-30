import java.util.Scanner;

public class Question3 {


    static public void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter name :");
        String name = console.nextLine();
        System.out.println("Enter age: ");
        int age = console.nextInt();
        int newAge = age +5 ;
        System.out.println("Hi " + name + ",you will be " + newAge+ " in five years time." );
    }
}
