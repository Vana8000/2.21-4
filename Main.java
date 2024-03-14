import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = input.nextLine();

        System.out.println("Введите подстроку:");
        String substr = input.nextLine();

        int count = countSubstring(str, substr);

        System.out.println("Подстрока встречается " + count + " раз");
    }

    public static int countSubstring(String str, String substr) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(substr, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += substr.length();
            }
        }

        return count;
    }
}