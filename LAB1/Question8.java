import java.util.Scanner;
public class Question8 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = console.nextInt();
        System.out.print("Enter length: ");
        double length = console.nextInt();
        double area = width * length ;
        double perimeter = (2*width) + (2*length);
        System.out.print("Area: " + area);
        System.out.print("Perimeter: " + perimeter);

    }
}
