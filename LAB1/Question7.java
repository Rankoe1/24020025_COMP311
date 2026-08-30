import java.util.Scanner ;
public class Question7 {


    public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter temperature in celsius: " );
            double celsiusTemperature = scn.nextInt();
            double fahrenheitTemperature = (celsiusTemperature * 9/5)+32 ;
            System.out.print("Enter temperature in fahrenheit: " + fahrenheitTemperature );
    }
}
