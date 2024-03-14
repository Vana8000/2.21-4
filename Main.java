import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        input = input.replace("кака", "вырезано цензурой");
        input = input.replace("бяка", "вырезано цензурой");

        System.out.println("Результат замены: " + input);
    }
}