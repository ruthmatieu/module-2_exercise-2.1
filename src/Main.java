import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");

        int celsius = reader.nextInt();
        reader.close();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
    }
}