import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = reader.nextInt();

        if (num == 0) {
            System.out.println(num + " Zero Number");
        } else if ((num % 2) == 0) {
            System.out.println(num + " is Even Number");
        } else {
            System.out.println(num + " is Odd Number");
        }

    }
}