import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        int spaceIndex = fullName.indexOf(' ');
        String firstName = fullName.substring(0, spaceIndex);
        String surname = fullName.substring(spaceIndex + 1);

        char initial1 = Character.toUpperCase(firstName.charAt(0));
        char initial2 = Character.toUpperCase(surname.charAt(0));

        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Initials: " + initial1 + "." + initial2 + ".");
    }
}

