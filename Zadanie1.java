import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz Liczbę: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Liczba Dodatnia");
        } else if (number < 0) {
            System.out.println("Liczba jest ujemna");
        } else {
            System.out.println("Wartość wynosi 0");
        }

        scanner.close();
    }
}