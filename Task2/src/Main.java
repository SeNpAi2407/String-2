import java.util.Scanner;

public class Main {
    public static String CORRECT_CHARS = " абвгдеёжзийклмнопрстуфхцчшщъыьэюя-";

    public static void main(String[] args) {

        String input = new Scanner(System.in).nextLine().trim().toLowerCase();
        boolean isValid = true;
        int spaceCount = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == ' ') {
                spaceCount++;
            }

            if (!CORRECT_CHARS.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
                break;
            }
        }

        if (isValid && spaceCount == 2) {

            String[] parts = input.split(" ");

            System.out.println("Фамилия: " + capitalize(parts[0]));
            System.out.println("Имя: " + capitalize(parts[1]));
            System.out.println("Отчество: " + capitalize(parts[2]));

        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }

    public static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
