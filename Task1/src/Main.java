public class Main {
    public static void main(String[] args) {
        System.out.println("Заглавные буквы:");
        for (char c = 'А'; c <= 'Я'; c++) {
            System.out.println(c + " : " + (int)c);
        }

        System.out.println("\nСтрочные буквы:");
        for (char c = 'а'; c <= 'я'; c++) {
            System.out.println(c + " : " + (int)c);
        }
    }
}
