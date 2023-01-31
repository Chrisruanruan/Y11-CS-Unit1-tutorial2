import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Please enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        String userInfo = "First name:" + firstName + "\nLast name: " + lastName + "\nage:" + age;
        System.out.print(userInfo);
    }
}