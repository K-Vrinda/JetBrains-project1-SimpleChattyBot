import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int maxDivBy4 = 0;
        while (scanner.hasNext()) {
            value = scanner.nextInt();
            if (value % 4 == 0 && value > maxDivBy4) maxDivBy4 = value;
        }
        System.out.println(maxDivBy4);
    }
}