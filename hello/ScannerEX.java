import java.util.Scanner;

public class ScannerEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert 2 diget integer:");
        String input = scanner.nextLine();

        scanner.close();
        int num = Integer.parseInt(input);

        System.out.println(num);
    }
}
