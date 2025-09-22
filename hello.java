// Simple Hello and Input Program
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print Hello
        System.out.println("Hello, Welcome to Java!");

        // Take input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Print message
        System.out.println("Nice to meet you, " + name + "!");

        sc.close();
    }
}
