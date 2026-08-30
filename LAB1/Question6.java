import java.util.Scanner;
public class Question6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter three test scores: ");
        int firstTestScore = scn.nextInt();
        int secondTestScore = scn.nextInt();
        int thirdTestScore = scn.nextInt();
        int average  = (firstTestScore + secondTestScore +thirdTestScore)/3 ;
        System.out.print("The average is : " + average);
    }
}
