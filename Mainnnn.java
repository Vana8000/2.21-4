import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mainnnn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите дату в формате дд.мм.гггг:");
        String inputDate = input.nextLine();

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = inputFormat.parse(inputDate);
            String outputDate = outputFormat.format(date);
            System.out.println("Преобразованная дата: " + outputDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        }
    }
}